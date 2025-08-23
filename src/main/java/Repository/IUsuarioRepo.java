package Repository;

import LogicaNegocio.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUsuarioRepo extends JpaRepository<Usuario, String> {
    @Override
    List<Usuario> findAll();

    List<Usuario> findByNombreStartsWithIgnoreCase(String nombre);

    boolean existsByNombreAndContrasena(String nombre, String contrasena);

}
