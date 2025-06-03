package LogicaNegocio.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private int id;
    private Proveedor proveedor;
    private List<Etiqueta> etiquetas;
    private List<Caracteristica> caracteristicas;
    @OneToMany(cascade= CascadeType.ALL) //Revisar cascade=
    private List<Precio> precios;
    private String nombre;
    private String descripcion;
}
