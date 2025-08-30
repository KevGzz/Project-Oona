package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.CaracteristicaDTO;
import LogicaNegocio.Entidades.Caracteristica;

public class CaracteristicaDTOMapper {
    public static Caracteristica FromDTO(CaracteristicaDTO caracteristicaDTO) {
        return new Caracteristica(caracteristicaDTO.getNombre(), caracteristicaDTO.getDescripcion());
    }
    public static CaracteristicaDTO ToDTO(Caracteristica caracteristica) {
        return new CaracteristicaDTO(caracteristica.getNombre(), caracteristica.getDescripcion());
    }
}
