package br.com.mtanuri.fiesta.model.convidado;

import java.time.LocalDate;

public class Convidado {

    private String nome;
    private int idade;

    protected Convidado(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public double getDesconto() {
        return 0;
    }

}
