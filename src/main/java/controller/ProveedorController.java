package controller;

import LogicaNegocio.Entidades.Proveedor;
import Repository.ProveedorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {
    @Autowired
    private ProveedorRepo gatoRepo;

    @PostMapping
    public Proveedor crear(@RequestBody Proveedor gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Proveedor> listar() {
        return gatoRepo.findAll();
    }

    @PutMapping
    public Proveedor editar(@RequestBody Proveedor gatinho) {
        return gatoRepo.save(gatinho);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Proveedor gatinho) {
        gatoRepo.delete(gatinho);
    }

}
