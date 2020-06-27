package br.com.ibytecolaboradores.endpoint;

import br.com.ibytecolaboradores.model.Pessoa;
import br.com.ibytecolaboradores.model.Setor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("pessoa")
public class PessoaEndpoint {
    @RequestMapping(method = RequestMethod.GET, path = "/listarPessoas")
    public List<Pessoa> listarPessoas() {
        return asList(new Pessoa(1L, "Fábio Leite Marques", new Date(), "2007556226543", "65476545300", "288766544323", true, true, 5000.00, new Setor(1L, "ti")),
                new Pessoa(1L, "Guilherme", new Date(), "2007556226543", "65476545300", "288766544323", true, true, 5000.00, new Setor(1L, "vendas")));
    }
}
