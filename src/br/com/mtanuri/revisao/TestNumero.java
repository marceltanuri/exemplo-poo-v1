package br.com.mtanuri.revisao;

import java.util.Scanner;

public class TestNumero {

    public static void main(String[] args) {

        System.out.println("Digite um número");
        int numeroOriundoDoTeclado = new Scanner(System.in).nextInt();
        Numero numero = new Numero(numeroOriundoDoTeclado);
        System.out.println(numero.isPar() ? "O número é par" : "O número é ímpar");

    }

}
