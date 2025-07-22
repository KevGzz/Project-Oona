package controller;

import LogicaNegocio.Entidades.Precio;
import Repository.PrecioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/precios")
public class PrecioController {
    @Autowired
    private PrecioRepo gatoRepo;

    @PostMapping
    public Precio crear(@RequestBody Precio gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Precio> listar() {
        return gatoRepo.findAll();
    }

    @PutMapping
    public Precio editar(@RequestBody Precio gatinho) {
        return gatoRepo.save(gatinho);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Precio gatinho) {
        gatoRepo.delete(gatinho);
    }

}
