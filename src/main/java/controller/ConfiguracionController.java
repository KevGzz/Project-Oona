package controller;


import LogicaNegocio.Entidades.Configuracion;
import Repository.ConfiguracionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/configuraciones")
public class ConfiguracionController {
    @Autowired
    private ConfiguracionRepo gatoRepo;

    @PostMapping
    public Configuracion crear(@RequestBody Configuracion gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Configuracion> listar() {
        return gatoRepo.findAll();
    }

}
