package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaNegocio.Entidades.Proveedor;

import java.util.Optional;

public class ProveedorDTOMapper {
    public static Proveedor FromDTO(ProveedorDTO dto){
        return Proveedor.builder().id(dto.getId()).razonSocial(dto.getRazonSocial())
                .telefono(dto.getTelefono()).email(dto.getEmail()).build();
    }
    public static ProveedorDTO ToDTO(Proveedor proveedor){
        return ProveedorDTO.builder().id(proveedor.getId()).RazonSocial(proveedor.getRazonSocial())
                .Telefono(proveedor.getTelefono()).Email(proveedor.getEmail()).build();
    }
}
