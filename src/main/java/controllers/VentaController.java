package controllers;

import LogicaNegocio.Entidades.Venta;
import Repository.IVentaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    private IVentaRepo gatoRepo;

    @PostMapping
    public Venta crear(@RequestBody Venta gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Venta> listar() {
        return gatoRepo.findAll();
    }

    @PutMapping
    public Venta editar(@RequestBody Venta gatinho) {
        return gatoRepo.save(gatinho);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Venta gatinho) {
        gatoRepo.delete(gatinho);
    }
}
