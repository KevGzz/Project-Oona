package controllers;

import LogicaAplicacion.DTOs.ProductoDTO;
import MercadoLibre.ClienteMercadoLibre;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private final ClienteMercadoLibre clienteMercadoLibre;

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> listar(@RequestHeader("X-userToken") String token) {
        return new ResponseEntity<>(clienteMercadoLibre.listarProductos(), HttpStatus.OK);
    }



}
