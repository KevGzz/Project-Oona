package LogicaAplicacion.DTOs;

import LogicaNegocio.Entidades.Caracteristica;
import lombok.*;
import org.antlr.v4.runtime.misc.EqualityComparator;

import java.util.List;
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Getter
@Setter
@Data
public class ProductoDTO {
    private String id;
    private final String idMeli;
    private final ProveedorDTO Proveedor;
    private final String urlFoto;
    private final List<CaracteristicaDTO> Caracteristicas;
    private final List<PrecioDTO> Precios;
    private final String Nombre;
    private final String Descripcion;
}
