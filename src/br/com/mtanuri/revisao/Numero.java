package br.com.mtanuri.revisao;

public class Numero {

    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isPar() {
        return this.numero % 2 == 0;
    }

    public int calculaPotenciaDeDois() {
        return this.numero * this.numero;
    }


}
