package Repository;

import LogicaNegocio.Entidades.Proveedor;
import LogicaNegocio.Entidades.Stock;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStockRepo extends JpaRepository<Stock, String> {
    Stock findStockById(String id);
}
