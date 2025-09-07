package LogicaAplicacion.CasosDeUso.Productos;

import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.InterfacesCU.Productos.IPostProductos;
import LogicaAplicacion.Mappers.ProductoDTOMapper;
import LogicaAplicacion.Mappers.ProveedorDTOMapper;
import LogicaNegocio.Entidades.Producto;
import LogicaNegocio.Entidades.Proveedor;
import Repository.IProductoRepo;
import Repository.IProveedorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PostProductos implements IPostProductos {

    private final IProductoRepo _productoRepo;
    private final IProveedorRepo _proveedorRepo;

    @Override
    public void addProducto(ProductoDTO dto) {
        Producto producto = ProductoDTOMapper.FromDTO(dto);
        if(dto.getProveedor() != null) {
            Proveedor proveedor = _proveedorRepo.findProveedorById(dto.getProveedor().getId());
            producto.setProveedor(proveedor);
        }
        this._productoRepo.save(producto);
    }

    @Override
    public void updateProducto(ProductoDTO producto) {
        String id = this._productoRepo.findIdByIdMeli(producto.getIdMeli()).getId();
        producto.setId(id);
        this._productoRepo.save(ProductoDTOMapper.FromDTO(producto));
    }

    @Override
    public void deleteProducto(ProductoDTO producto) {
        this._productoRepo.delete(ProductoDTOMapper.FromDTO(producto));
    }
}
