package Repository;

import LogicaNegocio.Entidades.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProveedorRepo extends JpaRepository<Proveedor, String> {

    Proveedor findProveedorById(String id);

}
