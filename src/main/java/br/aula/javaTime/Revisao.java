package br.aula.javaTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Revisao {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date2 = LocalDate.of(2024,10,04);
        System.out.println(date2);
        LocalDate date3 = LocalDate.parse("2024-10-05");
        System.out.println(date3);
        var dataNova = date3.plusDays(10);
        System.out.println(dataNova);

        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.of(19,17);
        LocalTime time3 = LocalTime.parse("19:15");
        System.out.println(time);
        System.out.println(time2);
        System.out.println(time3);

        LocalDateTime dataTime = dataNova.atTime(time3);
        System.out.println(dataTime);

        Period periodo = Period.of(10,5,15);
        System.out.println(periodo);

        Duration duration = Duration.ofHours(10);
        Duration duration1 = Duration.ofMinutes(10);
        System.out.println(duration);
        System.out.println(duration1);

        System.out.println(ChronoUnit.DAYS.between(date,date3 ));
    }
}
