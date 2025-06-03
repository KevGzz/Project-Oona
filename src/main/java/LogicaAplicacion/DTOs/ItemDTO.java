package LogicaAplicacion.DTOs;

public class ItemDTO {
    public ProductoDTO Producto;
    public int Cantidad;
    public ItemDTO(ProductoDTO Producto, int Cantidad) {
        this.Producto = Producto;
        this.Cantidad = Cantidad;
    }
}
