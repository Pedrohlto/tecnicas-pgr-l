package br.aula.javaTime;

import java.time.LocalDate;
import java.time.Period;

public class Periodo {

    public static void main(String[] args) {
        Period periodo = Period.of(10,8,15);
        System.out.println(periodo);

        Period periodos = Period.ofDays(10);
        System.out.println(periodos);

        Period periodoMeses = Period.ofMonths(5);
        System.out.println(periodoMeses);

        Period entreData = Period.between(LocalDate.now(), LocalDate.now().plusDays(10));
        System.out.println(entreData);


    }
}
