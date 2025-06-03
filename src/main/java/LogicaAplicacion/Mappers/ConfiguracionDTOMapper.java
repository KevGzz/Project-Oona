package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.ConfiguracionDTO;
import LogicaNegocio.Entidades.Configuracion;

public class ConfiguracionDTOMapper {
    public static Configuracion FromDTO(ConfiguracionDTO dto) {
        return new Configuracion(dto.Nombre, dto.Valor);
    }
    public static ConfiguracionDTO ToDTO(Configuracion configuracion) {
        return new ConfiguracionDTO(configuracion.getNombre(), configuracion.getValor());
    }
}
