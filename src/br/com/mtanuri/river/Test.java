package br.com.mtanuri.river;

import br.com.mtanuri.river.item.*;
import br.com.mtanuri.river.jogo.Jogo;
import br.com.mtanuri.river.jogo.JogoBuilder;
import br.com.mtanuri.river.local.Ilha;
import br.com.mtanuri.river.local.Local;
import br.com.mtanuri.river.travessia.TravessiaBuilder;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws Exception {

        Jogo jogo = new JogoBuilder()
                .comIlhas(new Ilha("lado esquerdo"), new Ilha("lado direito"))
                .comElementos(
                        new Humano(),
                        new Animal("Lobo", Arrays.asList(new ItemDeAlimentacao(Animal.class, "Bode"))),
                        new Animal("Bode", Arrays.asList(new ItemDeAlimentacao(Item.class, "Cenoura"))),
                        new Item("Cenoura")
                )
                .build();

        Ilha ladoEsquerdo = jogo.getIlhaByName("lado esquerdo");
        ladoEsquerdo.addItem(jogo.getElementos().values().toArray(new Item[]{}));

        Ilha ladoDireito = jogo.getIlhaByName("lado direito");

        Item humano = jogo.getItemByName("Humano");
        Item bode = jogo.getItemByName("Bode");
        Item lobo = jogo.getItemByName("Lobo");
        Item cenoura = jogo.getItemByName("Cenoura");

        try {
            // 1a travessia
            jogo.novaTravessia(new TravessiaBuilder().transportar(humano, bode).de(ladoEsquerdo).para(ladoDireito).build());

            // 2a travessia
            jogo.novaTravessia(new TravessiaBuilder().transportar(humano).de(ladoDireito).para(ladoEsquerdo).build());

            // 3a travessia
            jogo.novaTravessia(new TravessiaBuilder().transportar(humano, cenoura).de(ladoEsquerdo).para(ladoDireito).build());

            // 4a travessia
            jogo.novaTravessia(new TravessiaBuilder().transportar(humano).de(ladoDireito).para(ladoEsquerdo).build());

            // 5a travessia
            jogo.novaTravessia(new TravessiaBuilder().transportar(humano, lobo).de(ladoEsquerdo).para(ladoDireito).build());

            // 6a travessia
            jogo.novaTravessia(new TravessiaBuilder().transportar(humano).de(ladoDireito).para(ladoEsquerdo).build());

            // 7a travessia
            jogo.novaTravessia(new TravessiaBuilder().transportar(humano, bode).de(ladoEsquerdo).para(ladoDireito).build());

        } catch (Exception e) {
            System.out.println("Game over: " + e.getMessage());
        } finally {
            if (jogo.getIlhaByName("lado esquerdo").getItens().size() == 0) {
                System.out.println("Parabéns, você transportou todos os elementos em segurança para o outro lado. N. de travessias: " + jogo.getTotalTravessias());
            }
        }


    }

    private static void imprimeItens(Local local) {

        System.out.println("Itens do local: " + local.getNome());
        local.getItens().forEach(item -> System.out.println(item.getClass().getSimpleName()));

    }

}
