package LogicaNegocio.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Producto {
    private int id;
    private Proveedor proveedor;
    private List<Etiqueta> etiquetas;
    private List<Caracteristica> caracteristicas;
    @OneToMany(cascade= CascadeType.ALL) //Revisar cascade=
    private List<Precio> precios;
    private String nnombre;
    private String descripcion;
}
