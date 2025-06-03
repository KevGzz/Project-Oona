package LogicaAplicacion.DTOs;

import java.util.Date;
import java.util.List;

public class VentaDTO {
    public int Id;
    public Date Fecha;
    public List<ItemDTO> Items;
    public double PrecioTotal;
    public VentaDTO(int id, Date Fecha, List<ItemDTO> Items, double PrecioTotal) {
        Id = id;
        this.Fecha = Fecha;
        this.Items = Items;
        this.PrecioTotal = PrecioTotal;
    }
}
