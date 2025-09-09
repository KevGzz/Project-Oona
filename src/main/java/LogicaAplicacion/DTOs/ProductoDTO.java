package LogicaAplicacion.DTOs;

import LogicaNegocio.Entidades.Caracteristica;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.antlr.v4.runtime.misc.EqualityComparator;

import java.util.List;
@RequiredArgsConstructor
@Builder
@Getter
@Setter
@Data
public class ProductoDTO {
    private String id;
    private final String idMeli;
    private ProveedorDTO Proveedor;
    private final String urlFoto;
    private final List<CaracteristicaDTO> Caracteristicas;
    private final List<PrecioDTO> Precios;
    private final String Nombre;
    private final String Descripcion;

    @JsonCreator
    public ProductoDTO(
            @JsonProperty("id") String id,
            @JsonProperty("idMeli") String idMeli,
            @JsonProperty("proveedor") ProveedorDTO proveedor,
            @JsonProperty("urlFoto") String urlFoto,
            @JsonProperty("caracteristicas") List<CaracteristicaDTO> caracteristicas,
            @JsonProperty("precios") List<PrecioDTO> precios,
            @JsonProperty("nombre") String nombre,
            @JsonProperty("descripcion") String descripcion
    ){
        this.id = id;
        this.idMeli = idMeli;
        this.Proveedor = proveedor;
        this.urlFoto = urlFoto;
        this.Caracteristicas = caracteristicas;
        this.Precios = precios;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
    }

}
