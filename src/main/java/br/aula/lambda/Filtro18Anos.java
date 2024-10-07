package br.aula.lambda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Filtro18Anos implements Filtro{

    @Override
    public boolean teste(Pessoa pessoa) {
        if(ChronoUnit.YEARS.between(pessoa.getDataNascimento(), LocalDate.now()) >= 18){
                return true;
        }
        return false;
    }
}
