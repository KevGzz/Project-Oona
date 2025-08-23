package LogicaAplicacion.DTOs;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@Data
public class ProveedorDTO {
    private String id;
    private final String RazonSocial;
    private final String Telefono;
    private final String Email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
