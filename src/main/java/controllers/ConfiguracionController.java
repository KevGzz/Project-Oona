package controllers;


import LogicaNegocio.Entidades.Configuracion;
import Repository.IConfiguracionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/configuraciones")
public class ConfiguracionController {
    @Autowired
    private IConfiguracionRepo gatoRepo;

    @PostMapping
    public Configuracion crear(@RequestBody Configuracion gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Configuracion> listar() {
        return gatoRepo.findAll();
    }

    @PutMapping
    public Configuracion editar(@RequestBody Configuracion gatinho) {
        return gatoRepo.save(gatinho);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Configuracion gatinho) {
        gatoRepo.delete(gatinho);
    }

}
