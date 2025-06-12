package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.PrecioDTO;
import LogicaNegocio.Entidades.Precio;

public class PrecioDTOMapper {
    public static Precio FromDTO(PrecioDTO dto) {
        return new Precio(dto.getFechaDesde(),dto.getFechaHasta(),dto.getValor(),dto.getMoneda());
    }
    public static PrecioDTO ToDTO(Precio precio) {
        return new PrecioDTO(precio.getFechaDesde(),precio.getFechaHasta(),precio.getValor(),precio.getMoneda());
    }
}
