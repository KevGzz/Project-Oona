package controller;

import LogicaNegocio.Entidades.Producto;
import Repository.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoRepo gatoRepo;

    @PostMapping
    public Producto crear(@RequestBody Producto gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Producto> listar() {
        return gatoRepo.findAll();
    }

}
