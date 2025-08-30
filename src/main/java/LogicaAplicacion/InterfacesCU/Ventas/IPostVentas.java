package LogicaAplicacion.InterfacesCU.Ventas;

import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.DTOs.VentaDTO;

public interface IPostVentas {
    void addVenta(VentaDTO venta);
    void updateVenta(VentaDTO venta);
}
