package br.com.ibytecolaboradores.endpoint;

import br.com.ibytecolaboradores.error.CustomErrorType;
import br.com.ibytecolaboradores.model.Pessoa;
import br.com.ibytecolaboradores.model.Setor;
import br.com.ibytecolaboradores.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("pessoas")
public class PessoaEndpoint {
    @Autowired
    private DateUtil dateUtil;

    @GetMapping
    public ResponseEntity<?> listarPessoas() {
        return new ResponseEntity<>(asList(new Pessoa(1L, "Fábio Leite Marques", dateUtil.formatarLocalDateTime(LocalDateTime.now()), "2007556226543", "65476545300", "288766544323", true, true, 5000.00, new Setor(1L, "ti")),
                new Pessoa(1L, "Guilherme", dateUtil.formatarLocalDateTime(LocalDateTime.now()), "2007556226543", "65476545300", "288766544323", true, true, 5000.00, new Setor(1L, "vendas"))), HttpStatus.OK);
    }

    @GetMapping(path = "/{setor}")
    public ResponseEntity<?> listarPessoaPorSetor(@PathVariable("setor") Setor setor) {
        return new ResponseEntity<>(new CustomErrorType("Pessoa não encontrada"), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> cadastrarPessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<>(pessoa, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> deletarPessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<>(pessoa,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> atualizarPessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<>(pessoa,HttpStatus.OK);
    }

}

