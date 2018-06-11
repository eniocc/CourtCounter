package com.example.android.courtcounter.model;

public class Team {
    String nome;
    int pontos;

    public Team(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = this.pontos + pontos;
    }

    public void resetPontos() {
        this.pontos = 0;
    }
}
