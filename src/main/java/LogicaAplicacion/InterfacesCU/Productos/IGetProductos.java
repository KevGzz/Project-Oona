package LogicaAplicacion.InterfacesCU.Productos;

import LogicaAplicacion.DTOs.ProductoDTO;

import java.util.List;

public interface IGetProductos {
    List<ProductoDTO> getProductos();
    ProductoDTO getProducto(String id);
    boolean existeProducto(String id);
}
