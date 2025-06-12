package LogicaAplicacion.DTOs;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class ConfiguracionDTO {
    private final String Nombre;
    private final double Valor;
}
