package LogicaAplicacion.CasosDeUso.Usuarios;

import LogicaAplicacion.DTOs.UsuarioDTO;
import LogicaAplicacion.InterfacesCU.Usuarios.IGetUsuarios;
import LogicaAplicacion.Mappers.UsuarioDTOMapper;
import LogicaNegocio.Entidades.Usuario;
import Repository.IUsuarioRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
public class GetUsuarios implements IGetUsuarios {

    private final IUsuarioRepo _usuarioRepo;

    @Override
    public List<UsuarioDTO> getUsuarios() {
        return this._usuarioRepo.findAll().stream()
                .sorted(Comparator.comparing(Usuario::getNombre))
                .map(UsuarioDTOMapper::FromUsuario)
                .collect(Collectors.toList());
    }
}
