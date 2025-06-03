package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.EtiquetaDTO;
import LogicaNegocio.Entidades.Etiqueta;

public class EtiquetaDTOMapper {
    public static Etiqueta FromDTO(EtiquetaDTO dto){
        return new Etiqueta(dto.Nombre);
    }
    public static EtiquetaDTO ToDTO(Etiqueta etiqueta){
        return new EtiquetaDTO(etiqueta.getNombre());
    }
}
