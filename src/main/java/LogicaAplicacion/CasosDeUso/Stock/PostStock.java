package LogicaAplicacion.CasosDeUso.Stock;

import LogicaAplicacion.DTOs.StockDTO;
import LogicaAplicacion.InterfacesCU.Stock.IPostStock;
import LogicaAplicacion.Mappers.ProveedorDTOMapper;
import LogicaAplicacion.Mappers.StockDTOMapper;
import Repository.IStockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class PostStock implements IPostStock {

    private final IStockRepo stockRepo;

    @Override
    public void add(StockDTO stock) {
        stockRepo.save(StockDTOMapper.FromDTO(stock));
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
