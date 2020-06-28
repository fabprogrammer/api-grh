package br.com.ibytecolaboradores.endpoint;

import br.com.ibytecolaboradores.model.Pessoa;
import br.com.ibytecolaboradores.model.Setor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("setores")
public class SetorEndpoint {
    @GetMapping
    public List<Setor> listarSetores() {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> cadastrarSetor(@RequestBody Setor setor) {
        return new ResponseEntity<>(setor, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deletarSetor(@RequestBody Setor setor) {
        return new ResponseEntity<>(setor,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> atualizarSetor(@RequestBody Setor setor) {
        return new ResponseEntity<>(setor,HttpStatus.OK);
    }

}


