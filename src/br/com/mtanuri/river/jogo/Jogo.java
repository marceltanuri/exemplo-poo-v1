package br.com.mtanuri.river.jogo;

import br.com.mtanuri.river.local.Ilha;
import br.com.mtanuri.river.item.Item;
import br.com.mtanuri.river.travessia.Travessia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Jogo {

    private Collection<Travessia> travessias = new ArrayList<>();
    private HashMap<String, Item> elementos = new HashMap<>();
    private HashMap<String, Ilha> ilhas = new HashMap<>();

    protected Jogo() {
    }

    public void setTravessias(Collection<Travessia> travessias) {
        this.travessias = travessias;
    }

    public HashMap<String, Item> getElementos() {
        return elementos;
    }

    public void setElementos(HashMap<String, Item> elementos) {
        this.elementos = elementos;
    }

    public HashMap<String, Ilha> getIlhas() {
        return ilhas;
    }

    public Ilha getIlhaByName(String name) {
        return this.ilhas.get(name);
    }

    public Travessia novaTravessia(Travessia travessia) throws Exception {
        System.out.println("====== ====== ====== ====== ======");
        System.out.println("====== Iniciando nova travessia ======");
        System.out.println(String.format("Origem: %s, Destino: %s", travessia.getOrigem(), travessia.getDestino()));
        System.out.println(String.format("Itens a serem transportados [%s]: %s", travessia.getBarco().getItens().size(), travessia.getBarco().getItens()));
        System.out.println("Localização dos itens antes da travessia");
        this.ilhas.entrySet().forEach(entry -> {
            entry.getValue().imprimeItens();
        });

        this.travessias.add(travessia);
        travessia.descarregar();
        travessia.getOrigem().validar();
        travessia.getDestino().validar();

        System.out.println("Localização dos itens após da travessia");
        this.ilhas.entrySet().forEach(entry -> {
            entry.getValue().imprimeItens();
        });

        return travessia;

    }

    public Item getItemByName(String name) {
        return this.elementos.get(name);
    }

    public int getTotalTravessias() {
        return this.travessias.size();
    }

    public void setIlhas(HashMap<String, Ilha> ilhas) {
        this.ilhas = ilhas;
    }
}
