package br.aula.javaTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExemplo {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime dataAgora = LocalDateTime.now();
        System.out.println(dataAgora.format(formatter));

        LocalDateTime dataAgoraDois = LocalDateTime.of(2024,10,02,20,46,10,50);
        System.out.println(dataAgoraDois);

        LocalDateTime dataParse = LocalDateTime.parse("2024-10-02T20:46:10.000000050");
        System.out.println(dataParse);

        var dataNova = dataParse.minusDays(10)
                .plusHours(10)
                .plusMonths(10);

        System.out.println(dataNova);

        LocalDateTime localDateTime = LocalDateTime.parse("02/10/2024 20:58:10", formatter);
    var novaData =   localDateTime.plusMonths(10)
                .plusDays(10)
                .minusYears(1);

        System.out.println(novaData);

    }
}
