package LogicaAplicacion.DTOs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class StockDTO {
    private String Id;
    private final ProveedorDTO proveedor;
    private final ProductoDTO producto;
    private final int cantidad;

    @JsonCreator
    public StockDTO(
            @JsonProperty("id") String id,
            @JsonProperty("proveedor") ProveedorDTO proveedor,
            @JsonProperty("producto") ProductoDTO producto,
            @JsonProperty("cantidad") int cantidad
    ) {
        this.Id = id;
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidad = cantidad;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
