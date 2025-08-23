package controllers;

import LogicaAplicacion.CasosDeUso.Proveedores.GetProveedores;
import LogicaAplicacion.CasosDeUso.Proveedores.PostProveedores;
import LogicaAplicacion.DTOs.ProveedorDTO;
import LogicaNegocio.Entidades.Proveedor;
import Repository.IProveedorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedores")
@RequiredArgsConstructor
public class ProveedorController {
    @Autowired
    private final PostProveedores postProveedor;
    private final GetProveedores getProveedor;

    @PostMapping
    public ResponseEntity crear(@RequestBody ProveedorDTO proveedor, @RequestHeader("X-userToken") String token) {
        postProveedor.add(proveedor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProveedorDTO>> listar(@RequestHeader("X-userToken") String token) {
        return new ResponseEntity<>(getProveedor.listar(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity editar(@RequestBody ProveedorDTO proveedor, @RequestHeader("X-userToken") String token) {
        postProveedor.update(proveedor);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity eliminar(@RequestBody ProveedorDTO proveedor, @RequestHeader("X-userToken") String token) {
        postProveedor.delete(proveedor);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
