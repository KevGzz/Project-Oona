package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.StockDTO;
import LogicaNegocio.Entidades.Stock;

public class StockDTOMapper {
    public static Stock FromDTO(StockDTO dto) {
        return new Stock(dto.getId(), ProveedorDTOMapper.FromDTO(dto.getProveedor()), ProductoDTOMapper.FromDTO(dto.getProducto()), dto.getCantidad());
    }
    public static StockDTO toDTO(Stock stock) {
        return new StockDTO(stock.getIdStock(), ProveedorDTOMapper.ToDTO(stock.getProveedor()), ProductoDTOMapper.ToDTO(stock.getProducto()), stock.getCantidad());
    }
}
