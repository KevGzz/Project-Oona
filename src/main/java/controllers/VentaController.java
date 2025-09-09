package controllers;

import LogicaAplicacion.DTOs.StockDTO;
import LogicaAplicacion.DTOs.VentaDTO;
import LogicaAplicacion.InterfacesCU.Ventas.IPostVentas;
import LogicaNegocio.Entidades.Venta;
import MercadoLibre.ClienteMercadoLibre;
import Repository.IVentaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private final ClienteMercadoLibre clienteMercadoLibre;
    private final IPostVentas postVenta;

    @PostMapping
    public ResponseEntity crear(@RequestBody VentaDTO venta, @RequestHeader("X-userToken") String token) {
        postVenta.addVenta(venta);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<VentaDTO>>listar(@RequestHeader("X-userToken") String token) {
        return new ResponseEntity<>(clienteMercadoLibre.listarVentas(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity editar(@RequestBody VentaDTO venta, @RequestHeader("X-userToken") String token) {
        postVenta.updateVenta(venta);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity eliminar(@RequestBody VentaDTO venta, @RequestHeader("X-userToken") String token) {
        postVenta.delete(venta);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
