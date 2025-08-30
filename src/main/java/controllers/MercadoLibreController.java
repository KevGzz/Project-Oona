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

    private class BodyResponse {
        private String apiKey;
        public BodyResponse(String apiKey) {this.apiKey = apiKey;}
        public String getApiKey() {
            return apiKey;
        }
        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }
    }

    @PostMapping
    public ResponseEntity<BodyResponse> recibirCodigo(@RequestHeader("Codigo") String codigo) {
        String apiKey = clienteMercadoLibre.getAccessToken(codigo);
        BodyResponse retorno = new BodyResponse(apiKey);
        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> getInfoUser() {
        return new ResponseEntity<>(clienteMercadoLibre.getInfoUser(), HttpStatus.OK);
    }
}
