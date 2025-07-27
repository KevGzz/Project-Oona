package MercadoLibre;

import LogicaNegocio.Entidades.Producto;
import config.ApiEnvConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ClienteMercadoLibre {

    @Autowired
    private final ApiEnvConfig apiEnvConfig;

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
        apiEnvConfig.setToken_type(config.getToken_type());
        apiEnvConfig.setExpires_in(config.getExpires_in());
        apiEnvConfig.setScope(config.getScope());
        apiEnvConfig.setUser_id(config.getUser_id());
        apiEnvConfig.setRefresh_token(config.getRefresh_token());
    }

    public String getInfoUser(){
        RestClient restClient = RestClient.create();

        return restClient.get()
                .uri("https://api.mercadolibre.com/users/me")
                .header("Authorization", "Bearer " + apiEnvConfig.getAccess_token().toString())
                .retrieve()
                .body(String.class);
    }

    public String listarProductos() {
        RestClient restClient = RestClient.create();

        return restClient.get()
                .uri("https://api.mercadolibre.com/users/"+apiEnvConfig.getUser_id()+"/items/search")
                .header("Authorization", "Bearer " + apiEnvConfig.getAccess_token().toString())
                .retrieve()
                .body(String.class);

    }
}
