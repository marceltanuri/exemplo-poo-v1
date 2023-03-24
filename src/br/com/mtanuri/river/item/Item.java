package br.com.mtanuri.river.item;

public class Item {

    public Item() {
    }

    public Item(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        if (nome == null)
            return this.getClass().getSimpleName();

        return nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
