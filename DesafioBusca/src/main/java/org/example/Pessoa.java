package org.example;

import java.util.List;

public class Pessoa {
    private String nome;
    private String telefone;
    private List<Endereco> enderecos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Pessoa() {

    }

    public Pessoa(String nome, String telefone, List<Endereco> enderecos) {
        this.nome = nome;
        this.telefone = telefone;
        this.enderecos = enderecos;
    }
}
