package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaNegocio.Entidades.Proveedor;

public class ProveedorDTOMapper {
    public static Proveedor FromDTO(ProveedorDTO dto){
        return new Proveedor(dto.getRazonSocial(), dto.getTelefono(), dto.getEmail());
    }
    public static ProveedorDTO ToDTO(Proveedor proveedor){
        return new ProveedorDTO(proveedor.getRazonSocial(), proveedor.getRazonSocial(), proveedor.getTelefono());
    }
}
