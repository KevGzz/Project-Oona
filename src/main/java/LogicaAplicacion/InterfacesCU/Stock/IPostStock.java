package LogicaAplicacion.InterfacesCU.Stock;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.DTOs.StockDTO;

public interface IPostStock {

    void add(StockDTO stock);

    void update(StockDTO stock);

    void delete(StockDTO stock);
}
