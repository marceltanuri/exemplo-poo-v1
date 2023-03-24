package br.com.mtanuri.fiesta1.test;

import br.com.mtanuri.fiesta.repository.ConvidadosImpl;
import br.com.mtanuri.fiesta1.Convidado;

public class TestConvidado {

    public static void main(String[] args) {
        Convidado keila = new Convidado("Keila", "31/03/1999");
        System.out.println(String.format("O convidado de nome %s tem idade igual a %s", keila.getNome(), keila.identificaIdade()) );
    }
}
