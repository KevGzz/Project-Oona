package LogicaAplicacion.Mappers;

import LogicaAplicacion.DTOs.UsuarioDTO;
import LogicaNegocio.Entidades.Usuario;

public class UsuarioDTOMapper {
    public static Usuario FromDTO(UsuarioDTO dto){
        return new Usuario(dto.Nombre, dto.Contrasena);
    }
    public static UsuarioDTO FromUsuario(Usuario usuario){
        return new UsuarioDTO(usuario.getNombre(), usuario.getContrasena());
    }
}
