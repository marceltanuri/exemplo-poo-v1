package br.com.mtanuri.fiesta.util;

import java.time.LocalDate;

public interface CalculadoraDeDatas {

    public long calculaIdade(LocalDate dataDeNascimento) throws InvalidDateFormatException;

}
