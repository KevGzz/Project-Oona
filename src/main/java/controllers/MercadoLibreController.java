package controllers;

import MercadoLibre.ClienteMercadoLibre;
import config.ApiEnvConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/mercadoLibre")
public class MercadoLibreController {
    @Autowired
    private final ClienteMercadoLibre clienteMercadoLibre;

    @PostMapping
    public ResponseEntity<String> recibirCodigo(@RequestHeader("Codigo") String codigo) {
        clienteMercadoLibre.getAccessToken(codigo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> getInfoUser() {
        return new ResponseEntity<>(clienteMercadoLibre.getInfoUser(), HttpStatus.OK);
    }
}
