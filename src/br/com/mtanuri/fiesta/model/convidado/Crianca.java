package br.com.mtanuri.fiesta.model.convidado;

public class Crianca extends Convidado {
    protected Crianca(String nome,  int idade) {
        super(nome, idade);
    }

    @Override
    public double getDesconto() {
        return 0.5;
    }
}
