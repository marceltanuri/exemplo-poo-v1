package br.com.mtanuri.river.local;

import br.com.mtanuri.river.item.Animal;

public class Ilha extends Local {

    public Ilha(String nome) {
        super(nome);
    }

    @Override
    public void validar() throws Exception {
        this.getItens().forEach(item -> {
            if (Animal.class.isInstance(item)) {
                Animal animal = (Animal) item;
                try {
                    animal.tentaComer(this);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

}
