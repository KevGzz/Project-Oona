package LogicaNegocio.Entidades;

import jakarta.persistence.*;
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
    @ManyToOne
    private Proveedor proveedor;
    private String urlFoto;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Caracteristica> caracteristicas;
    @OneToMany(cascade= CascadeType.ALL) //Revisar cascade=
    private List<Precio> precios;
    private String nombre;
    private String descripcion;
}
