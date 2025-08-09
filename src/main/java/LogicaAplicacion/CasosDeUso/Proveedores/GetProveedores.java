package LogicaAplicacion.CasosDeUso.Proveedores;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.InterfacesCU.Proveedores.IGetProveedores;
import LogicaAplicacion.Mappers.ProveedorDTOMapper;
import Repository.IProveedorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProveedores implements IGetProveedores {

    private final IProveedorRepo _proveedorRepo;

    @Override
    public ProveedorDTO findById(String id) {
        return ProveedorDTOMapper.ToDTO(this._proveedorRepo.findProveedorById(id));
    }
}
