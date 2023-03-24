package br.com.mtanuri.cursos;

import java.util.Scanner;

public class AssinaturaDeCurso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o valor do cartao de credito");
        String numeroDoCartao = sc.nextLine();

        CartaoDeCredito cc = new CartaoDeCredito("");


        if (verificaCartao(numeroDoCartao)) {
            System.out.println("Cartão valido, sua compra será processada");
        } else {
            System.out.println("Cartão invalido, verifique os dados do cartão");
        }


    }

    static boolean verificaCartao(String numero) {

        int sum = 0;
        boolean alternate = false;
        for (int i = numero.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(numero.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }

        if ((sum % 10 != 0)) {
            return false;
        }

        return true;
    }

}
