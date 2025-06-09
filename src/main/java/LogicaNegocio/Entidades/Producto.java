package LogicaNegocio.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;
@Entity
@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto extends EntidadBase{
    private Proveedor proveedor;
    private List<Etiqueta> etiquetas;
    private List<Caracteristica> caracteristicas;
    @OneToMany(cascade= CascadeType.ALL) //Revisar cascade=
    private List<Precio> precios;
    private String nombre;
    private String descripcion;
}
