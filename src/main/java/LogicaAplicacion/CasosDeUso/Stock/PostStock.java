package LogicaAplicacion.CasosDeUso.Stock;

import LogicaAplicacion.DTOs.StockDTO;
import LogicaAplicacion.InterfacesCU.Stock.IPostStock;
import LogicaAplicacion.Mappers.ProveedorDTOMapper;
import LogicaAplicacion.Mappers.StockDTOMapper;
import LogicaNegocio.Entidades.Producto;
import LogicaNegocio.Entidades.Proveedor;
import LogicaNegocio.Entidades.Stock;
import Repository.IProductoRepo;
import Repository.IProveedorRepo;
import Repository.IStockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PostStock implements IPostStock {

    private final IStockRepo stockRepo;
    private final IProveedorRepo proveedorRepo;
    private final IProductoRepo productoRepo;

    @Override
    public void add(StockDTO dto) {
        Stock stock = StockDTOMapper.FromDTO(dto);
        if(dto.getProveedor() != null) {
            Proveedor proveedor = proveedorRepo.findProveedorById(dto.getProveedor().getId());
            stock.setProveedor(proveedor);
        }
        if(dto.getProducto() != null) {
            Producto producto = productoRepo.findProductoById(dto.getProducto().getId());
            stock.setProducto(producto);
        }
        stockRepo.save(stock);
    }

    @Override
    public void update(StockDTO stock) {
        String id = this.stockRepo.findStockById(stock.getId()).getId();
        stock.setId(id);
        this.stockRepo.save(StockDTOMapper.FromDTO(stock));
    }

    @Override
    public void delete(StockDTO stock) {
        stockRepo.delete(StockDTOMapper.FromDTO(stock));
    }
}
