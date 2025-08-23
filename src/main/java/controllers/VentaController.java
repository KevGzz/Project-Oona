package controllers;

import LogicaAplicacion.DTOs.VentaDTO;
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

    @GetMapping
    public ResponseEntity<List<VentaDTO>>listar(@RequestHeader("X-userToken") String token) {
        return new ResponseEntity<>(clienteMercadoLibre.listarVentas(), HttpStatus.OK);
    }

}
