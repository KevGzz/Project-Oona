package LogicaAplicacion.CasosDeUso.Proveedores;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.InterfacesCU.Proveedores.IGetProveedores;
import LogicaAplicacion.Mappers.ProveedorDTOMapper;
import Repository.IProveedorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GetProveedores implements IGetProveedores {

    private final IProveedorRepo _proveedorRepo;

    @Override
    public ProveedorDTO findById(String id) {
        return ProveedorDTOMapper.ToDTO(this._proveedorRepo.findProveedorById(id));
    }

    @Override
    public List<ProveedorDTO> listar() {
        return _proveedorRepo.findAll().stream().map(ProveedorDTOMapper::ToDTO).collect(Collectors.toList());
    }

}
