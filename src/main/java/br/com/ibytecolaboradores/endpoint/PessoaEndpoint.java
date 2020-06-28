package br.com.ibytecolaboradores.endpoint;

import br.com.ibytecolaboradores.model.Pessoa;
import br.com.ibytecolaboradores.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pessoas")
public class PessoaEndpoint {


    private final PessoaRepository pessoaDao;

    @Autowired
    public PessoaEndpoint(PessoaRepository pessoaDao) {
        this.pessoaDao = pessoaDao;
    }

    @GetMapping
    public ResponseEntity<?> listarPessoas() {
        return new ResponseEntity<>(pessoaDao.findAll(), HttpStatus.OK);
    }

    /*@GetMapping(path = "/{setor}")
    public ResponseEntity<?> listarPessoaPorSetor(@PathVariable("setor") Setor setor) {
        return new ResponseEntity<>(new CustomErrorType("Pessoa não encontrada"), HttpStatus.OK);
    }*/

    @PostMapping
    public ResponseEntity<?> cadastrarPessoa(@RequestBody Pessoa pessoa) {
        return new ResponseEntity<>(pessoaDao.save(pessoa), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deletarPessoa(@PathVariable("id") Long id) {
        pessoaDao.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> atualizarPessoa(@RequestBody Pessoa pessoa) {
        pessoaDao.save(pessoa);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

