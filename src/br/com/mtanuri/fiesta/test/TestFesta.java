package br.com.mtanuri.fiesta.test;

import br.com.mtanuri.fiesta.model.Festa;
import br.com.mtanuri.fiesta.repository.ConvidadosImpl;

import java.time.LocalDateTime;

public class TestFesta {

    public static void main(String[] args) {

        Festa festa = new Festa(new ConvidadosImpl().list(), LocalDateTime.of(2023, 7, 9, 14, 00), "Marcel Tanuri");
        System.out.println(festa.getRelatorio());

    }
}
