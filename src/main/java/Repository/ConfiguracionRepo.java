package Repository;

import LogicaNegocio.Entidades.Configuracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionRepo extends JpaRepository<Configuracion, String> {
}
