package LogicaAplicacion.DTOs;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class ProveedorDTO {
    private final String RazonSocial;
    private final String Telefono;
    private final String Email;
}
