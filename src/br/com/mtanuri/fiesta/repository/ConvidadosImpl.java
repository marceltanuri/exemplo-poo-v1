package br.com.mtanuri.fiesta.repository;

import br.com.mtanuri.fiesta.model.convidado.Convidado;
import br.com.mtanuri.fiesta.model.convidado.ConvidadoFactory;
import br.com.mtanuri.fiesta.util.CalculadoraDeDatasImpl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ConvidadosImpl implements Convidados {
    @Override
    public Collection<Convidado> list() {
        ConvidadoFactory convidadoFactory = new ConvidadoFactory(new CalculadoraDeDatasImpl());
        return Arrays.asList(
                convidadoFactory.build("Rafaela", "19/05/2012", "dd/MM/yyyy"),
                convidadoFactory.build("Esther", "18/06/2020", "dd/MM/yyyy"),
                convidadoFactory.build("Rejane", "12/09/1962", "dd/MM/yyyy")
        );
    }
}
