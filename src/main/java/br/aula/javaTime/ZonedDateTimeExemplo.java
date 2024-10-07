package br.aula.javaTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExemplo {

    public static void main(String[] args) {
        ZonedDateTime dataComFuso = ZonedDateTime.now();
        System.out.println(dataComFuso);
        ZonedDateTime dataComFusoMontada = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/New_York"));
        System.out.println(dataComFusoMontada);

        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }
}
