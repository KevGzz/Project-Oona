package LogicaNegocio.Entidades;

import java.sql.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private Date fechaVenta;
    private List<Item> items;
    private double precioTotal;
}
