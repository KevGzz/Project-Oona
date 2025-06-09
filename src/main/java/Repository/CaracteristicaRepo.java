package Repository;

import LogicaNegocio.Entidades.Caracteristica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaracteristicaRepo extends JpaRepository<Caracteristica, String> {
}
