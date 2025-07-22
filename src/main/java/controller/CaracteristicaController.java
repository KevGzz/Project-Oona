package controller;

import LogicaNegocio.Entidades.Caracteristica;
import Repository.CaracteristicaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caracteristicas")
public class CaracteristicaController {
    @Autowired
    private CaracteristicaRepo gatoRepo;

    @PostMapping
    public Caracteristica crear(@RequestBody Caracteristica gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Caracteristica> listar() {
        return gatoRepo.findAll();
    }

    @PutMapping
    public Caracteristica editar(@RequestBody Caracteristica gatinho) {
        return gatoRepo.save(gatinho);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Caracteristica gatinho) {
        gatoRepo.delete(gatinho);
    }

}
