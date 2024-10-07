package br.aula.javaTime;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);
        LocalDate dataOntem = LocalDate.of(2024, 10, 1);
        System.out.println(dataOntem);
        LocalDate dataPorParseAmanha = LocalDate.parse("2024-10-03");
        System.out.println(dataPorParseAmanha);
        LocalDate novaData = dataPorParseAmanha.minusDays(10);
        System.out.println(novaData);
        LocalDate dataNova = novaData.plusDays(60)
                .plusMonths(10)
                .plusYears(10);

        System.out.println(dataNova);

        System.out.println(LocalDate.now().isEqual(dataNova));
        System.out.println(LocalDate.now().isAfter(dataNova));
        System.out.println(dataNova.isAfter(LocalDate.now()));

        System.out.println(dataNova.isLeapYear());

    }
}
