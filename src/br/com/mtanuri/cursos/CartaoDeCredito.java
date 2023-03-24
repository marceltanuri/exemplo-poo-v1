package br.com.mtanuri.cursos;

public class CartaoDeCredito {

    CartaoDeCredito(){

    }

    void explicacao(){
        String numeroDoCartao = "JOAO";
        this.numero = this.numero + numeroDoCartao;
    }

    CartaoDeCredito(String numero, int cvv, String dataDeValidade) {
        this.numero = numero;
        this.cvv = cvv;
        this.dataDeValidade = dataDeValidade;
        this.explicacao();
    }

    CartaoDeCredito(String numero) {
        this.numero = numero;
    }

    CartaoDeCredito(String numero, int cvv, String dataDeValidade, String nomeImpresso) {
        this.numero = numero;
        this.cvv = cvv;
        this.dataDeValidade = dataDeValidade;
        this.nomeImpresso = nomeImpresso;
    }

    String numero;
    String nomeImpresso;
    int cvv;
    String dataDeValidade;

    String bandeira;

    void teste() {
        identificaBandeira();
    }

    String identificaBandeira() {

        if (numero.startsWith("6")) {
            return "Elo";
        } else if (numero.startsWith("5")) {
            return "Master Card";
        } else if (numero.startsWith("4")) {
            return "Visa";
        } else if (numero.startsWith("3")) {
            return "American Express";
        } else {
            return "Outros";
        }

    }


    boolean isUmCartaoDeCredito() {
        //TODO implementar a lógica
        return false;
    }

    boolean verificaCartao() {

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

    boolean verificaValidade() {
        // TODO validade maior que data atual
        return true;
    }


}
