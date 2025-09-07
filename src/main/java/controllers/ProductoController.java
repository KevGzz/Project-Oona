package controllers;

import LogicaAplicacion.CasosDeUso.Productos.PostProductos;
import LogicaAplicacion.DTOs.ProductoDTO;
import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaAplicacion.InterfacesCU.Productos.IPostProductos;
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
    private final IPostProductos postProductos;

    @GetMapping
    public ResponseEntity<List<ProductoDTO>> listar(@RequestHeader("X-userToken") String token) {
        return new ResponseEntity<>(clienteMercadoLibre.listarProductos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity crear(@RequestBody ProductoDTO producto, @RequestHeader("X-userToken") String token) {
        postProductos.addProducto(producto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity editar(@RequestBody ProductoDTO producto, @RequestHeader("X-userToken") String token) {
        postProductos.updateProducto(producto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity eliminar(@RequestBody ProductoDTO producto, @RequestHeader("X-userToken") String token) {
        postProductos.deleteProducto(producto);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
