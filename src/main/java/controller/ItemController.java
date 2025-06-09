package controller;

import LogicaNegocio.Entidades.Item;
import Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemRepo gatoRepo;

    @PostMapping
    public Item crear(@RequestBody Item gatinho) {
        return gatoRepo.save(gatinho);
    }

    @GetMapping
    public List<Item> listar() {
        return gatoRepo.findAll();
    }

}
