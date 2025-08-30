package LogicaAplicacion.DTOs;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class VentaDTO {
    private String id;
    private final Date Fecha;
    private final List<ItemDTO> Items;
    private final double PrecioTotal;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
