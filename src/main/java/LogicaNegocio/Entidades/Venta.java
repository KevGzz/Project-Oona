package LogicaNegocio.Entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    private int idVenta;
    private Date fechaVenta;
    private List<Item> items;
    private double precioTotal;
}
