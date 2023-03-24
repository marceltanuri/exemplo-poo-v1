package br.com.mtanuri.river.travessia;

import br.com.mtanuri.river.item.Item;
import br.com.mtanuri.river.local.Barco;
import br.com.mtanuri.river.local.Ilha;

public class Travessia {

    private Barco barco;
    private Ilha origem;
    private Ilha destino;

    protected Travessia() {
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Ilha getOrigem() {
        return origem;
    }

    public void setOrigem(Ilha origem) {
        this.origem = origem;
    }

    public Ilha getDestino() {
        return destino;
    }

    public void setDestino(Ilha destino) {
        this.destino = destino;
    }

    public void descarregar() throws Exception {
        this.barco.validar();
        for (Item item : this.barco.getItens()) {
            this.origem.getItens().remove(item);
            this.destino.getItens().add(item);
        }

    }


}
