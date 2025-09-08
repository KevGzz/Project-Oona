package LogicaAplicacion.CasosDeUso.Productos;

import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.InterfacesCU.Productos.IPostProductos;
import LogicaAplicacion.Mappers.ProductoDTOMapper;
import LogicaNegocio.Entidades.Caracteristica;
import LogicaNegocio.Entidades.Producto;
import LogicaNegocio.Entidades.Proveedor;
import Repository.ICaracteristicaRepo;
import Repository.IProductoRepo;
import Repository.IProveedorRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostProductos implements IPostProductos {

    private final IProductoRepo _productoRepo;
    private final IProveedorRepo _proveedorRepo;
    private final ICaracteristicaRepo _caracteristicaRepo;

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
        String id = this._productoRepo.findProductoById(producto.getId()).getId();
        producto.setId(id);
        this._productoRepo.save(ProductoDTOMapper.FromDTO(producto));
    }

    @Override
    public void updateProductoFromMELI(ProductoDTO producto) {
        String id = this._productoRepo.findIdByIdMeli(producto.getIdMeli()).getId();
        producto.setId(id);
        this._productoRepo.save(ProductoDTOMapper.FromDTO(producto));
    }

    @Transactional
    @Override
    public void deleteProducto(ProductoDTO producto) {
        Producto productoD = this._productoRepo.findProductoById(producto.getId());
        if(productoD != null) {
            for(Caracteristica c: productoD.getCaracteristicas()) {
                this._caracteristicaRepo.removeById(c.getId());
            }
            this._productoRepo.removeProductoById(productoD.getId());
        }
    }
}
