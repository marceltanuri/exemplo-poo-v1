package br.com.mtanuri.fiesta.model.convidado;

public class CriancaPequena extends Crianca {
    protected CriancaPequena(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public double getDesconto() {
        return 1;
    }
}
