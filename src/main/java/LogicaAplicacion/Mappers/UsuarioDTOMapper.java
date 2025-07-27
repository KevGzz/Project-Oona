package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.UsuarioDTO;
import LogicaNegocio.Entidades.Usuario;

public class UsuarioDTOMapper {
    public static Usuario FromDTO(UsuarioDTO dto){
        return new Usuario(dto.getNombre(), dto.getContrasena());
    }
    public static UsuarioDTO FromUsuario(Usuario usuario){
        return UsuarioDTO.builder().Nombre(usuario.getNombre()).build();
    }
}
