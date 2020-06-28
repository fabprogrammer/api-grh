package br.com.ibytecolaboradores.repository;

import br.com.ibytecolaboradores.model.Pessoa;
import br.com.ibytecolaboradores.model.Setor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
    List<Pessoa> findBySetor(Setor setor);
}
