package Repository;

import LogicaNegocio.Entidades.Precio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrecioRepo extends JpaRepository<Precio, String> {
}
