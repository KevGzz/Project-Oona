package MercadoLibre;

import LogicaAplicacion.DTOs.CaracteristicaDTO;
import LogicaAplicacion.DTOs.PrecioDTO;
import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.InterfacesCU.Productos.IGetProductos;
import LogicaAplicacion.InterfacesCU.Productos.IPostProductos;
import LogicaAplicacion.InterfacesCU.Proveedores.IGetProveedores;
import LogicaNegocio.Entidades.Producto;
import config.ApiEnvConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ClienteMercadoLibre {

    @Autowired
    private final ApiEnvConfig apiEnvConfig;
    @Autowired
    private final IPostProductos postProductos;
    @Autowired
    private final IGetProductos getProductos;
    @Autowired
    private final IGetProveedores getProveedores;

    public void getAccessToken(String codigo){
        RestClient restClient = RestClient.create();
        Map<String, Object> body = Map.of(
            "grant_type", "authorization_code",
            "client_id", "6568777871031299",
            "client_secret", "19V7x4ApeUKthEgVG7ETjj1uXNaC3aIv",
            "code", codigo,
            "redirect_uri", "https://ant-needed-apparently.ngrok-free.app/"
        );

        ApiEnvConfig config = restClient.post()
                .uri("https://api.mercadolibre.com/oauth/token")
                .contentType(MediaType.APPLICATION_JSON)
                .body(body)
                .retrieve()
                .body(ApiEnvConfig.class);

        apiEnvConfig.setAccess_token(config.getAccess_token());
//      System.out.println(apiEnvConfig.getAccess_token());
        apiEnvConfig.setToken_type(config.getToken_type());
        apiEnvConfig.setExpires_in(config.getExpires_in());
        apiEnvConfig.setScope(config.getScope());
        apiEnvConfig.setUser_id(config.getUser_id());
        apiEnvConfig.setRefresh_token(config.getRefresh_token());
//      System.out.println(apiEnvConfig.getRefresh_token());
    }

    public String getInfoUser(){
        RestClient restClient = RestClient.create();

        return restClient.get()
                .uri("https://api.mercadolibre.com/users/me")
                .header("Authorization", "Bearer " + apiEnvConfig.getAccess_token().toString())
                .retrieve()
                .body(String.class);
    }

    public List<ProductoDTO> listarProductos() {
        RestClient restClient = RestClient.create();

        Map<String, Object> response = restClient.get()
                .uri("https://api.mercadolibre.com/users/" + apiEnvConfig.getUser_id() + "/items/search")
                .header("Authorization", "Bearer " + apiEnvConfig.getAccess_token().toString())
                .retrieve()
                .body(new ParameterizedTypeReference<>() {
                });

        List<String> results = (List<String>) response.get("results");
        List<ProductoDTO> productos = new ArrayList<>();

        for (String resultado : results) {

            Map<String, Object> item = restClient.get()
                    .uri("https://api.mercadolibre.com/items/" + resultado.toString())
                    .header("Authorization", "Bearer " + apiEnvConfig.getAccess_token().toString())
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });

            List<CaracteristicaDTO> caracteristicas = new ArrayList<>();
            List<Map<String, Object>> attributes = (List<Map<String, Object>>) item.get("attributes");
            for (Map<String, Object> c : attributes) {
                caracteristicas.add(new CaracteristicaDTO((String) c.get("name"), (String) c.get("value_name")));
            }
            Map<String, Object> pricesClient = restClient.get()
                    .uri("https://api.mercadolibre.com/items/" + resultado.toString() + "/prices")
                    .header("Authorization", "Bearer " + apiEnvConfig.getAccess_token().toString())
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });

            List<PrecioDTO> precios = new ArrayList<>();
            List<Map<String, Object>> prices = (List<Map<String, Object>>) pricesClient.get("prices");
            for (Map<String, Object> p : prices) {
                precios.add(new PrecioDTO(Date.from(Instant.parse((String)p.get("last_updated"))), Integer.valueOf((Integer) p.get("amount")), (String) p.get("currency_id")));
            }

            Map<String, Object> descriptionClient = restClient.get()
                    .uri("https://api.mercadolibre.com/items/"+resultado.toString()+"/description")
                    .header("Authorization", "Bearer " + apiEnvConfig.getAccess_token().toString())
                    .retrieve()
                    .body(new ParameterizedTypeReference<>() {
                    });
            String description = (String) descriptionClient.get("plain_text");

            ProductoDTO producto = new ProductoDTO(
                    resultado.toString(),
                    null,
                    (String) item.get("thumbnail"),
                    caracteristicas,
                    precios,
                    (String) item.get("title"),
                    description
            );
            productos.add(producto);
        }
        agregarProductos(productos);
        return getProductos.getProductos();
    }

    private void agregarProductos(List<ProductoDTO> retorno) {
        for (ProductoDTO producto : retorno) {
            if(getProductos.existeProducto(producto.getIdMeli())){
                postProductos.updateProducto(producto);
            }
            else postProductos.addProducto(producto);
        }
    }

}
