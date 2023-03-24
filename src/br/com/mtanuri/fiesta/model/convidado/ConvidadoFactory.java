package br.com.mtanuri.fiesta.model.convidado;

import br.com.mtanuri.fiesta.util.CalculadoraDeDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvidadoFactory {

    public static final int MAX_AGE_CRIANCA_PEQUENA = 6;
    public static final int MAX_AGE_CRIANCA = 12;
    public static final int ADULT_AGE = 18;
    private CalculadoraDeDatas calculadoraDeDatas;

    public ConvidadoFactory(CalculadoraDeDatas calculadoraDeDatas) {
        this.calculadoraDeDatas = calculadoraDeDatas;
    }

    public Convidado build(String nome, String dataDeNascimento, String dateFormat) {
        return build(nome, LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern(dateFormat)));
    }

    public Convidado build(String nome, LocalDate dataDeNascimento) {
        int idade = (int) calculadoraDeDatas.calculaIdade(dataDeNascimento);

        if (idade <= MAX_AGE_CRIANCA_PEQUENA) {
            return new CriancaPequena(nome, idade);
        } else if (idade > MAX_AGE_CRIANCA_PEQUENA && idade <= MAX_AGE_CRIANCA) {
            return new Crianca(nome, idade);
        } else if (idade >= ADULT_AGE) {
            return new Adulto(nome, idade);
        } else {
            return new Convidado(nome, idade);
        }

    }

}
