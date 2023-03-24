package br.com.mtanuri.river.item;

public class ItemDeAlimentacao {

    private Class<?> type;
    private String nome;

    public ItemDeAlimentacao(Class<?> type, String nome) {
        this.type = type;
        this.nome = nome;
    }

    public Class<?> getType() {
        return type;
    }

    public String getNome() {
        return nome;
    }

    public boolean equals(Item item) {
        return this.type.isInstance(item) && this.nome.equals(item.getNome());
    }
}
