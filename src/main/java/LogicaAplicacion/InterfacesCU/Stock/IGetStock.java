package LogicaAplicacion.InterfacesCU.Stock;

import LogicaAplicacion.DTOs.StockDTO;

import java.util.List;

public interface IGetStock {
    StockDTO findById(String id);
    List<StockDTO> listar();
}
