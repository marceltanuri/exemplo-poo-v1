package br.com.mtanuri.fiesta.test;

import br.com.mtanuri.fiesta.util.CalculadoraDeDatasImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestCalculadoraDeDatas {

    public static void main(String[] args) {
        System.out.println(new CalculadoraDeDatasImpl().calculaIdade(LocalDate.parse("12/04/1990", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
    }
}
