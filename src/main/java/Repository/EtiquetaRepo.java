package Repository;

import LogicaNegocio.Entidades.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtiquetaRepo extends JpaRepository<Etiqueta, String> {
}
