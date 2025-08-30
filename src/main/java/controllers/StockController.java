package controllers;

import LogicaAplicacion.CasosDeUso.Stock.GetStock;
import LogicaAplicacion.CasosDeUso.Stock.PostStock;
import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.DTOs.StockDTO;
import LogicaNegocio.Entidades.Stock;
import Repository.IProveedorRepo;
import Repository.IStockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private final PostStock postStock;
    private final GetStock getStock;

    @PostMapping
    public ResponseEntity crear(@RequestBody StockDTO stock) {
        postStock.add(stock);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<StockDTO>> listar(@RequestHeader("X-userToken") String token) {
        return new ResponseEntity<>(getStock.listar(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity editar(@RequestBody StockDTO stock) {
        postStock.update(stock);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity eliminar(@RequestBody StockDTO stock) {
        postStock.delete(stock);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
