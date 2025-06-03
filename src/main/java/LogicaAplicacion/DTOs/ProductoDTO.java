package LogicaAplicacion.DTOs;

import LogicaNegocio.Entidades.Caracteristica;
import org.antlr.v4.runtime.misc.EqualityComparator;

import java.util.List;

public class ProductoDTO {
    public int Id;
    public ProveedorDTO Proveedor;
    public List<EtiquetaDTO> Etiquetas;
    public List<CaracteristicaDTO> Caracteristicas;
    public List<PrecioDTO> Precios;
    public String Nombre;
    public String Descripcion;
    public ProductoDTO(int id, ProveedorDTO proveedor, List<EtiquetaDTO> etiquetas,
                       List<CaracteristicaDTO> caracteristicas, List<PrecioDTO> precios,
                       String nombre, String descripcion) {
        Id = id;
        Proveedor = proveedor;
        Etiquetas = etiquetas;
        Caracteristicas = caracteristicas;
        Precios = precios;
        Nombre = nombre;
        Descripcion = descripcion;
    }
}
