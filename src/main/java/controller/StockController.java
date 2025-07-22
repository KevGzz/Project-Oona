package controller;

import LogicaNegocio.Entidades.Stock;
import Repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockRepo gatoRepo;

    @PostMapping
    public Stock crear(@RequestBody Stock gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Stock> listar() {
        return gatoRepo.findAll();
    }

    @PutMapping
    public Stock editar(@RequestBody Stock gatinho) {
        return gatoRepo.save(gatinho);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Stock gatinho) {
        gatoRepo.delete(gatinho);
    }

}
