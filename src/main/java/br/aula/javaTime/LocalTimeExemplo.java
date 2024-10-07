package br.aula.javaTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeExemplo {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime2 = LocalTime.of(21,10);
        System.out.println(localTime2);

        var novaData = LocalDate.now().atTime(LocalTime.now());
        System.out.println(novaData);






    }
}
