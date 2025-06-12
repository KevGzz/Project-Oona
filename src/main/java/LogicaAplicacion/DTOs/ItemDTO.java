package LogicaAplicacion.DTOs;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class ItemDTO {
    private final ProductoDTO Producto;
    private final int Cantidad;
}
