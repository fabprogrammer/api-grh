package br.com.ibytecolaboradores.model;

import java.util.Date;

public class Pessoa {
    private Long id;
    private String nome;
    private Date dataNascimento;
    private String rg;
    private String cpf;
    private String ctps;
    private Boolean pcd;
    private Boolean ativo;
    private Double salario;
    private Setor setor;

    public Pessoa() {
    }

    public Pessoa(Long id, String nome, Date dataNascimento, String rg, String cpf, String ctps, Boolean pcd, Boolean ativo, Double salario, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.ctps = ctps;
        this.pcd = pcd;
        this.ativo = ativo;
        this.salario = salario;
        this.setor = setor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public Boolean getPcd() {
        return pcd;
    }

    public void setPcd(Boolean pcd) {
        this.pcd = pcd;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
