package Repository;

import LogicaNegocio.Entidades.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoItem extends JpaRepository<Item, String> {
}
