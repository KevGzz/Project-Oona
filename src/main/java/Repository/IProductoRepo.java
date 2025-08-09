package Repository;

import LogicaNegocio.Entidades.Caracteristica;
import LogicaNegocio.Entidades.Precio;
import LogicaNegocio.Entidades.Producto;
import LogicaNegocio.Entidades.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Repository
public interface IProductoRepo extends JpaRepository<Producto, String> {

    @Query("select (count(p) > 0) from Producto p where p.idMeli = ?1")
    boolean existsByIdMeli(String idMeli);

    @Query("select p from Producto p where p.idMeli = ?1")
    Producto findIdByIdMeli(String idMeli);
}

