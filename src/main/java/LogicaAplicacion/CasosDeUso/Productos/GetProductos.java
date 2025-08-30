package LogicaAplicacion.CasosDeUso.Productos;

import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.InterfacesCU.Productos.IGetProductos;
import LogicaAplicacion.Mappers.ProductoDTOMapper;
import LogicaNegocio.Entidades.Producto;
import Repository.IProductoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class GetProductos implements IGetProductos {

    private final IProductoRepo _productoRepo;

    @Override
    public List<ProductoDTO> getProductos() {
        List<ProductoDTO> retorno = new ArrayList<>();
        List<Producto> productos = _productoRepo.findAll();
        for (Producto producto: productos){
            retorno.add(ProductoDTOMapper.ToDTO(producto));
        }
        return retorno;
    }

    @Override
    public ProductoDTO getProducto(String id) {
        return null;
    }

    @Override
    public boolean existeProducto(String id) {
        return this._productoRepo.existsByIdMeli(id);
    }
}
