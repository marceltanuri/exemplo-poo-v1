package br.com.mtanuri.river.jogo;

import br.com.mtanuri.river.local.Ilha;
import br.com.mtanuri.river.item.Item;

public class JogoBuilder {

    private Jogo jogo = new Jogo();

    public JogoBuilder comElementos(Item... itens) {
        for (Item item : itens) {
            jogo.getElementos().put(item.getNome(), item);
        }
        return this;
    }

    public JogoBuilder comIlhas(Ilha... ilhas) {
        for (Ilha ilha : ilhas) {
            jogo.getIlhas().put(ilha.getNome(), ilha);
        }
        return this;
    }

    public Jogo build() {
        return this.jogo;
    }
}
