package br.com.mtanuri.fiesta1;

import java.time.LocalDate;

public class Convidado {

    private String nome;
    private String dataDeNascimento;

    public Convidado(String nome, String dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public int identificaIdade() {
        System.out.println("Calculando a idade de acordo com a " +
                "data de nascimento: " + this.dataDeNascimento);
        return LocalDate.now().getYear() - Integer.parseInt(dataDeNascimento.split("/")[2]);
    }

    public String getNome() {
        return this.nome;
    }
}