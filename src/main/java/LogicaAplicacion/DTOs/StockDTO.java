package LogicaAplicacion.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class StockDTO {
    private String Id;
    private final ProveedorDTO Proveedor;
    private final ProductoDTO Producto;
    private final int Cantidad;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
