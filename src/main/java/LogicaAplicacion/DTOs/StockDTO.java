package LogicaAplicacion.DTOs;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class StockDTO {
    private final int Id;
    private final ProveedorDTO Proveedor;
    private final ProductoDTO Producto;
    private final int Cantidad;
}
