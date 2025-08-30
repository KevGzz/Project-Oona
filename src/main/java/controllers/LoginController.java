package controllers;

import Encriptado.JwtUtils;
import LogicaAplicacion.DTOs.UsuarioDTO;
import Repository.IUsuarioRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
@RequiredArgsConstructor
public class LoginController {

    @Autowired
    private final IUsuarioRepo usuarioRepo;
    private final JwtUtils jwtUtils;

    private class BodyResponse {
        private String token;
        public BodyResponse(String token) {this.token = token;}
        public String getToken() {
            return token;
        }
        public void setToken(String token) {
            this.token = token;
        }
    }

    @PostMapping
    public ResponseEntity<BodyResponse> login(@RequestBody UsuarioDTO usuario) {
        if(usuarioRepo.existsByNombreAndContrasena(usuario.getNombre(), usuario.getContrasena())) {
            String token = jwtUtils.generateJwtToken(usuario.getNombre());
            return new ResponseEntity<>(new BodyResponse(token), HttpStatus.OK);
        }
        else return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }


}
