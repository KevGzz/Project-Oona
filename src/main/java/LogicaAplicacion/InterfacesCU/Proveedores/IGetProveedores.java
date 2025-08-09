package LogicaAplicacion.InterfacesCU.Proveedores;

import LogicaAplicacion.DTOs.ProveedorDTO;

public interface IGetProveedores {
    ProveedorDTO findById(String id);
}
