package LogicaAplicacion.DTOs;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class VentaDTO {
    private String id;
    private final Date Fecha;
    private final List<ItemDTO> Items;
    private final double PrecioTotal;

    @JsonCreator
    public VentaDTO(
            @JsonProperty("id") String id,
            @JsonProperty("fecha") Date fecha,
            @JsonProperty("items") List<ItemDTO> items,
            @JsonProperty("precioTotal") double precioTotal
    ) {
        this.id = id;
        this.Fecha = fecha;
        this.Items = items;
        this.PrecioTotal = precioTotal;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
