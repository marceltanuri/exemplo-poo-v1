package br.com.mtanuri.fiesta.util;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class CalculadoraDeDatasImpl implements CalculadoraDeDatas {

    @Override
    public long calculaIdade(LocalDate dataDeNascimento) throws InvalidDateFormatException {

        return dataDeNascimento.until(LocalDate.now(), ChronoUnit.YEARS);
    }
}
