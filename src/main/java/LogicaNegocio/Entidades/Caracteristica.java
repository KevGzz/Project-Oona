package LogicaNegocio.Entidades;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Caracteristica {
    private String nombre;
    private String descripcion;
    public Caracteristica() {}
    public Caracteristica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
