package br.com.mtanuri.river.local;

import br.com.mtanuri.river.item.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public abstract class Local {

    private String nome;

    public Local() {
    }

    public Local(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        if (nome == null)
            return this.getClass().getSimpleName();

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Collection<Item> itens = new ArrayList();

    public Collection<Item> getItens() {
        return itens;
    }

    public void imprimeItens() {
        System.out.println(String.format("Itens do local: %s [%s]", this.nome, this.itens.size()));
        this.itens.forEach(item -> System.out.println(item.getNome()));
    }

    public void addItem(Item... itens) {
        for (Item item : itens) {
            this.getItens().add(item);
        }

    }

    public void setItens(Collection<Item> itens) {
        this.itens = itens;
    }

    public boolean hasAny(Class<?> clazz) {
        return this.itens.stream().anyMatch(clazz::isInstance);
    }

    public boolean hasAny(Predicate<Item> predicate) {
        return this.itens.stream().anyMatch(predicate);
    }

    public abstract void validar() throws Exception;

    @Override
    public String toString() {
        return this.getNome();
    }
}
