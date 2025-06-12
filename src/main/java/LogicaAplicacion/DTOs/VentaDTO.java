package LogicaAplicacion.DTOs;

import java.sql.Date;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class VentaDTO {
    private final int Id;
    private final Date Fecha;
    private final List<ItemDTO> Items;
    private final double PrecioTotal;
}
