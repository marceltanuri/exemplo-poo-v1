package br.com.mtanuri.fiesta.model;

import br.com.mtanuri.fiesta.model.convidado.Adulto;
import br.com.mtanuri.fiesta.model.convidado.Convidado;
import br.com.mtanuri.fiesta.model.convidado.Crianca;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Festa {

    private Collection<Convidado> convidados;
    private LocalDateTime data;
    private String nomeDoContratante;

    public Festa(Collection convidados, LocalDateTime data, String nomeDoContratante) {
        this.convidados = convidados;
        this.data = data;
        this.nomeDoContratante = nomeDoContratante;
    }

    public Collection getConvidados() {
        return convidados;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getNomeDoContratante() {
        return nomeDoContratante;
    }

    public double getValorPorPessoa() {
        return 50.0;
    }

    private double getValorTotal() {
        return (convidados.size() - this.getDescontos()) * getValorPorPessoa();
    }

    private double getDescontos() {
        return convidados.stream().map(convidado -> convidado.getDesconto()).mapToDouble(d -> d).sum();
    }

    public String getRelatorio() {

        int contAdultos = 0;
        int contCriancas = 0;

        for (Convidado convidado : convidados) {
            if (Crianca.class.isInstance(convidado)) {
                contCriancas++;
            } else if (Adulto.class.isInstance(convidado)) {
                contAdultos++;
            }

        }

        return String.format("Total de adultos: %s. Total de crianças: %s.\n" +
                "Total de convidados %s. Total de pagantes: %s. Valor por pessoa: %s.\n" +
                "Valor total a pagar: R$ %s", contAdultos, contCriancas, convidados.size(), this.convidados.size() - this.getDescontos(), this.getValorPorPessoa(), this.getValorTotal());
    }
}
