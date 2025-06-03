package LogicaNegocio.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Precio {
    private Date fechaDesde;
    private Date fechaHasta;
    private double valor;
    private Moneda moneda;
}
