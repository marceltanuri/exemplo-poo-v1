package br.com.mtanuri.fiesta1;

public class Festa {

    public static final int IDADE_MAXIMA_CRIANCA_NAO_PAGANTE = 6;
    public static final int IDADE_MAXIMA_CRIANCA_MEIA_PAGANTE = 12;

    private String dataDoEvento;

    private String nomeDoContratante;

    private Convidado[] convidados;

    private double valorPorPessoa;

    public Festa(String dataDoEvento, String nomeDoContratante, Convidado[] convidados, double valorPorPessoa) {
        this.dataDoEvento = dataDoEvento;
        this.nomeDoContratante = nomeDoContratante;
        this.convidados = convidados;
        this.valorPorPessoa = valorPorPessoa;
    }

    public double calculaValorTotal() {

        return this.valorPorPessoa * this.getQuantidadeDePagantes();
    }

    public double getQuantidadeDePagantes() {
        double pagantes = 0;

        for (Convidado convidado : this.convidados) {
            int idade = convidado.identificaIdade();

            if (idade <= IDADE_MAXIMA_CRIANCA_NAO_PAGANTE) {
                continue;
            } else if (idade > IDADE_MAXIMA_CRIANCA_NAO_PAGANTE &&
                    idade <= IDADE_MAXIMA_CRIANCA_MEIA_PAGANTE) {
                pagantes += 0.5;
            } else {
                pagantes += 1;
            }
        }

        return pagantes;
    }


}
