package LogicaAplicacion.InterfacesCU.Productos;

import LogicaAplicacion.DTOs.ProductoDTO;

public interface IPostProductos {
    void addProducto(ProductoDTO producto);
    void updateProducto(ProductoDTO producto);
}
