package Repository;

import LogicaNegocio.Entidades.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface IVentaRepo extends JpaRepository<Venta, String> {
    @Override
    Optional<Venta> findById(String s);

    @Override
    List<Venta> findAll();

    boolean existsByFechaVenta(Date fechaVenta);

    String findIdByFechaVenta(Date fechaVenta);

}
