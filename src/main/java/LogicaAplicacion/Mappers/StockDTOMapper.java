package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.DTOs.StockDTO;
import LogicaNegocio.Entidades.Stock;

public class StockDTOMapper {
    public static Stock FromDTO(StockDTO dto) {
        return new Stock(ProveedorDTOMapper.FromDTO(dto.getProveedor()), ProductoDTOMapper.FromDTO(dto.getProducto()), dto.getCantidad());
    }
    public static StockDTO toDTO(Stock stock) {
        return StockDTO.builder().Id(stock.getId()).Proveedor(ProveedorDTOMapper.ToDTO(stock.getProveedor()))
                .Producto(ProductoDTOMapper.ToDTO(stock.getProducto())).Cantidad(stock.getCantidad()).build();
    }
}
