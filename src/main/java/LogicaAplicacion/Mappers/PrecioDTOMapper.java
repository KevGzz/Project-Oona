package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.PrecioDTO;
import LogicaNegocio.Entidades.Precio;

public class PrecioDTOMapper {
    public static Precio FromDTO(PrecioDTO dto) {
        return new Precio(dto.getFecha(),dto.getValor(),dto.getMoneda());
    }
    public static PrecioDTO ToDTO(Precio precio) {
        return new PrecioDTO(precio.getFecha(),precio.getValor(),precio.getMoneda());
    }
}
