package br.aula.javaTime;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {

    public static void main(String[] args) {

        Duration duration = Duration.ofHours(10);
        System.out.println(duration);
        Duration duration1 = Duration.ofMinutes(5);
        System.out.println(duration1);
        Duration duration2 = Duration.ofDays(10);
        System.out.println(duration2);
        var duracao = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusMinutes(10));
        System.out.println(duracao);

    }
}
