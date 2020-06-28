package br.com.ibytecolaboradores.model;

import javax.persistence.Entity;

@Entity
public class Setor extends AbstractEntity {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
