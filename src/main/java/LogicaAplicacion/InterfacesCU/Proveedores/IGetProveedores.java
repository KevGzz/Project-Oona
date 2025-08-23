package LogicaAplicacion.InterfacesCU.Proveedores;

import LogicaAplicacion.DTOs.ProveedorDTO;

import java.util.List;

public interface IGetProveedores {
    ProveedorDTO findById(String id);
    List<ProveedorDTO> listar();
}
