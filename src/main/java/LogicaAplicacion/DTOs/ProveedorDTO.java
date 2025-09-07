package LogicaAplicacion.DTOs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Data
@RequiredArgsConstructor
public class ProveedorDTO {
    private String id;
    private final String RazonSocial;
    private final String Telefono;
    private final String Email;

    @JsonCreator
    public ProveedorDTO(
            @JsonProperty("id") String id,
            @JsonProperty("RazonSocial") String razonSocial,
            @JsonProperty("Telefono") String telefono,
            @JsonProperty("Email") String email
    ) {
        this.id = id;
        this.RazonSocial = razonSocial;
        this.Telefono = telefono;
        this.Email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
