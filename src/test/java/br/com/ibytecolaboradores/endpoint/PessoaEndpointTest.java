package br.com.ibytecolaboradores.endpoint;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PessoaEndpointTest {

    PessoaEndpoint pessoaEndpoint;

    @BeforeEach
    public void setUp(){
        /*============================Montagem do Cenario=============================*/
        pessoaEndpoint = new PessoaEndpoint();
    }

    @AfterEach
    public void tearDown(){
        /*executa no final da execução do teste*/
        clearObject(pessoaEndpoint);
    }

    @org.junit.jupiter.api.Test
    void listarPessoas() {
        System.out.println(pessoaEndpoint.listarPessoas().get(0));
        String nomeEsperado = "Fábio Leite Marques";
        Assertions.assertEquals(nomeEsperado,pessoaEndpoint.listarPessoas().get(0).getNome());
    }

    public void clearObject(Object objeto){
        objeto = null;
    }
}