package com.programacao.web.fatec.api_fatec.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cliente {
    private Long id;
    private String nome;
    private Integer idade;
    private String rua;
    private String bairro;
    private Integer numero;

    // Construtores
    public Cliente() {}

    public Cliente(Long id, String nome, int idade, String rua, String bairro, Integer numero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    // Getters e Setters
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}