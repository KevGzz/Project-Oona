package Repository;

import LogicaNegocio.Entidades.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStockRepo extends JpaRepository<Stock, String> {
}
