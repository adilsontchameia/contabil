package com.example.juros.models;

public class ModelExpressoes {

    String expressao;
    String descricao;

    public ModelExpressoes() {
    }

    public ModelExpressoes(String expressao, String descricao) {
        this.expressao = expressao;
        this.descricao = descricao;
    }

    public ModelExpressoes(String nome, int string) {
    }

    public String getExpressao() {
        return expressao;
    }

    public void setExpressao(String expressao) {
        this.expressao = expressao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
