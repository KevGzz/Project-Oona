package LogicaAplicacion.DTOs;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class PrecioDTO {
    private final Date Fecha;
    private final double Valor;
    private final String Moneda;
}
