package LogicaAplicacion.DTOs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.List;


@RequiredArgsConstructor
@Builder
@Data
public class ItemDTO {
    private String id;
    private final ProductoDTO producto;
    private final int cantidad;

    @JsonCreator
    public ItemDTO(
            @JsonProperty("id") String id,
            @JsonProperty("producto") ProductoDTO producto,
            @JsonProperty("cantidad") int cantidad
    ) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
