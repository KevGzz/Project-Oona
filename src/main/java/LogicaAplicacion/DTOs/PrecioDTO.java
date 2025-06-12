package LogicaAplicacion.DTOs;

import LogicaNegocio.Entidades.Moneda;

import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class PrecioDTO {
    private final Date FechaDesde;
    private final Date FechaHasta;
    private final double Valor;
    private final Moneda Moneda;
}
