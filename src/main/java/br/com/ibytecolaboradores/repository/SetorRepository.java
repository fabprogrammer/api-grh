package br.com.ibytecolaboradores.repository;

import br.com.ibytecolaboradores.model.Setor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SetorRepository extends CrudRepository<Setor, Long> {
    List<Setor> findByNome(String name);
}
