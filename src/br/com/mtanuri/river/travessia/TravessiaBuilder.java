package br.com.mtanuri.river.travessia;

import br.com.mtanuri.river.local.Barco;
import br.com.mtanuri.river.local.Ilha;
import br.com.mtanuri.river.item.Item;

public class TravessiaBuilder {

    private Travessia travessia = new Travessia();

    public TravessiaBuilder transportar(Item... itens) throws Exception {
        this.travessia.setBarco(new Barco(itens));
        return this;
    }

    public TravessiaBuilder de(Ilha ilha) {
        this.travessia.setOrigem(ilha);
        return this;
    }

    public TravessiaBuilder para(Ilha ilha) {
        this.travessia.setDestino(ilha);
        return this;
    }

    public Travessia build() throws Exception{
        return this.travessia;
    }


}
