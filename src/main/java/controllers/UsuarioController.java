package controllers;

import LogicaAplicacion.DTOs.UsuarioDTO;
import LogicaAplicacion.InterfacesCU.Usuarios.IGetUsuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/personas")
public class UsuarioController {
    @Autowired
    private IGetUsuarios getUsuarios;

    @PostMapping
    public UsuarioDTO crear(@RequestBody UsuarioDTO gatinho) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listar() {
        return new ResponseEntity(getUsuarios.getUsuarios(), HttpStatus.OK);
    }
    @PutMapping
    public UsuarioDTO editar(@RequestBody UsuarioDTO gatinho) {
        return null;
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody UsuarioDTO gatinho) {
    }
}
