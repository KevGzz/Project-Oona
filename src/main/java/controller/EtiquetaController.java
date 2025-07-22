package controller;

import LogicaNegocio.Entidades.Etiqueta;
import Repository.EtiquetaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etiquetas")
public class EtiquetaController {
    @Autowired
    private EtiquetaRepo gatoRepo;

    @PostMapping
    public Etiqueta crear(@RequestBody Etiqueta gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Etiqueta> listar() {
        return gatoRepo.findAll();
    }

    @PutMapping
    public Etiqueta editar(@RequestBody Etiqueta gatinho) {
        return gatoRepo.save(gatinho);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Etiqueta gatinho) {
        gatoRepo.delete(gatinho);
    }

}
