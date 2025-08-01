package LogicaAplicacion.DTOs;

import LogicaNegocio.Entidades.Caracteristica;
import org.antlr.v4.runtime.misc.EqualityComparator;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class ProductoDTO {
    private final ProveedorDTO Proveedor;
    private final String urlFoto;
    private final List<CaracteristicaDTO> Caracteristicas;
    private final List<PrecioDTO> Precios;
    private final String Nombre;
    private final String Descripcion;
}
