package LogicaAplicacion.DTOs;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class CaracteristicaDTO {
    private final String Nombre;
    private final String Descripcion;

}
