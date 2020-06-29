package br.com.ibytecolaboradores.endpoint;

import br.com.ibytecolaboradores.model.Setor;
import br.com.ibytecolaboradores.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("setores")
public class SetorEndpoint {

    private final SetorRepository setorDao;

    @Autowired
    public SetorEndpoint(SetorRepository setorDao) {
        this.setorDao = setorDao;
    }

    @GetMapping
    public ResponseEntity<?> listarSetores() {
        return new ResponseEntity<>(setorDao.findAll(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> cadastrarSetor(@RequestBody Setor setor) {
        return new ResponseEntity<>(setorDao.save(setor), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> deletarSetor(@PathVariable("id") Long id) {
        setorDao.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> atualizarSetor(@RequestBody Setor setor) {
        setorDao.save(setor);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}


