package LogicaAplicacion.CasosDeUso.Productos;

import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.InterfacesCU.Productos.IPostProductos;
import LogicaAplicacion.Mappers.ProductoDTOMapper;
import LogicaNegocio.Entidades.Producto;
import Repository.IProductoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PostProductos implements IPostProductos {

    private final IProductoRepo _productoRepo;

    @Override
    public void addProducto(ProductoDTO producto) {
        this._productoRepo.save(ProductoDTOMapper.FromDTO(producto));
    }

    @Override
    public void updateProducto(ProductoDTO producto) {
        String id = this._productoRepo.findIdByIdMeli(producto.getIdMeli()).getId();
        producto.setId(id);
        this._productoRepo.save(ProductoDTOMapper.FromDTO(producto));
    }
}
