package Repository;

import LogicaNegocio.Entidades.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProveedorRepo extends JpaRepository<Proveedor, String> {
}
