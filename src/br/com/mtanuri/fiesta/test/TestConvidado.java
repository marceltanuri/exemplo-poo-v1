package br.com.mtanuri.fiesta.test;

import br.com.mtanuri.fiesta.repository.Convidados;
import br.com.mtanuri.fiesta.repository.ConvidadosImpl;

public class TestConvidado {

    public static void main(String[] args) {

        Convidados convidados = new ConvidadosImpl();

        convidados.list().forEach(convidado -> {
            System.out.printf("Convidado %s, com idade igual à %s anos, quantidade de desconto é %s",
                    convidado.getNome(),
                    convidado.getIdade(), convidado.getDesconto());
            System.out.println();
            System.out.println();
        });


    }
}
