package LogicaAplicacion.InterfacesCU.Ventas;

import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.DTOs.VentaDTO;

import java.util.Date;
import java.util.List;

public interface IGetVentas {
    List<VentaDTO> getVentas();
    VentaDTO getVenta(String id);
    boolean existeVenta(Date fecha);
}
