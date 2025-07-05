package controller;

import LogicaNegocio.Entidades.Usuario;
import Repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class UsuarioController {
    @Autowired
    private UsuarioRepo gatoRepo;

    @PostMapping
    public Usuario crear(@RequestBody Usuario gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Usuario> listar() {
        return gatoRepo.findAll();
    //Usuario.builder().nombre("Gatinho").contrasena("12345678").build(); //retorna un tipo usuario
    }
    @PutMapping
    public Usuario editar(@RequestBody Usuario gatinho) {
        return gatoRepo.save(gatinho);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Usuario gatinho) {
        gatoRepo.delete(gatinho);
    }
}
