package Repository;

import LogicaNegocio.Entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iProductoRepo extends JpaRepository<Producto, String> {
}
