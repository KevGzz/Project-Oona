package controllers;

import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.DTOs.StockDTO;
import LogicaNegocio.Entidades.Stock;
import Repository.IProveedorRepo;
import Repository.IStockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class StockController {
//    @Autowired
//    private final PostStock postStock;
//    private final GetStock getStock;
//
//    @PostMapping
//    public ResponseEntity<> crear(@RequestBody StockDTO stock) {
//        return new ResponseEntity<>(postStock.add(stock), HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<StockDTO>> listar(@RequestHeader("X-userToken") String token) {
//        return new ResponseEntity<>(getStock.listar(), HttpStatus.OK);
//    }
//
//    @PutMapping
//    public ResponseEntity<> editar(@RequestBody StockDTO stock) {
//        return new ResponseEntity<>(postStock.update(stock), HttpStatus.CREATED);
//    }
//
//    @DeleteMapping
//    public ResponseEntity<> eliminar(@RequestBody StockDTO stock) {
//        return new ResponseEntity<>(postStock.delete(stock), HttpStatus.OK);
//    }

}
