package LogicaAplicacion.DTOs;

public class StockDTO {
    public int Id;
    public ProveedorDTO Proveedor;
    public ProductoDTO Producto;
    public int Cantidad;
    public StockDTO(int id, ProveedorDTO proveedor, ProductoDTO producto, int cantidad) {
        Id = id;
        Proveedor = proveedor;
        Producto = producto;
        Cantidad = cantidad;
    }
}
