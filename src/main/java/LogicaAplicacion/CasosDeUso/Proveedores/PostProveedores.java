package LogicaAplicacion.CasosDeUso.Proveedores;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.InterfacesCU.Proveedores.IPostProveedores;
import LogicaAplicacion.Mappers.ProveedorDTOMapper;
import Repository.IProveedorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostProveedores implements IPostProveedores {

    private final IProveedorRepo proveedorRepo;

    @Override
    public void add(ProveedorDTO proveedor) {
        proveedorRepo.save(ProveedorDTOMapper.FromDTO(proveedor));
    }

    @Override
    public void update(ProveedorDTO proveedor) {
        String id = this.proveedorRepo.findProveedorById(proveedor.getId()).getId();
        proveedor.setId(id);
        this.proveedorRepo.save(ProveedorDTOMapper.FromDTO(proveedor));
    }

    @Override
    public void delete(ProveedorDTO proveedor) {
        this.proveedorRepo.delete(ProveedorDTOMapper.FromDTO(proveedor));
    }
}
