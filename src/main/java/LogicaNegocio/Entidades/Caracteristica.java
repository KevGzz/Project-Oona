package LogicaNegocio.Entidades;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Getter @Setter
public class Caracteristica extends EntidadBase{
    private String nombre;
    private String descripcion;
    public Caracteristica() {}
    public Caracteristica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
