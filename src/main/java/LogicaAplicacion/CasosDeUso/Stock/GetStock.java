package LogicaAplicacion.CasosDeUso.Stock;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.DTOs.StockDTO;
import LogicaAplicacion.InterfacesCU.Stock.IGetStock;
import LogicaAplicacion.Mappers.ProveedorDTOMapper;
import LogicaAplicacion.Mappers.StockDTOMapper;
import Repository.IStockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetStock implements IGetStock {

    private final IStockRepo stockRepo;

    @Override
    public StockDTO findById(String id) {
        return StockDTOMapper.toDTO(this.stockRepo.findStockById(id));
    }

    @Override
    public List<StockDTO> listar() {
        return stockRepo.findAll().stream().map(StockDTOMapper::toDTO).collect(Collectors.toList());
    }
}
