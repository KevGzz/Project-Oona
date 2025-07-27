package controllers;

import LogicaNegocio.Entidades.Producto;
import MercadoLibre.ClienteMercadoLibre;
import Repository.iProductoRepo;
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
    public ResponseEntity<String> listar() {
        return new ResponseEntity<>(clienteMercadoLibre.listarProductos(), HttpStatus.OK);
    }



}
