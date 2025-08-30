package LogicaAplicacion.InterfacesCU.Proveedores;

import LogicaAplicacion.DTOs.ProveedorDTO;

public interface IPostProveedores {
    void add(ProveedorDTO proveedor);

    void update(ProveedorDTO proveedor);

    void delete(ProveedorDTO proveedor);
}
