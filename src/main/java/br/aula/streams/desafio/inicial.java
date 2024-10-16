package br.aula.streams.desafio;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class inicial {

    public static void main(String[] args) {
        List<String> streamFromList = List.of("Pedro", "Maria", "Joseph", "João", "Ana", "José", "Marta", "Paulo", "Lucas", "Luciana");
        Stream<String> streamsNomes = Stream.of("Pedro", "Maria", "Joseph", "João", "Ana", "José", "Marta", "Paulo", "Lucas", "Luciana");
        Stream<String> streamVazio  = Stream.empty();
        Stream<String> valor = Stream.generate(() -> new String("Valor"));

        BinaryOperator<String> binary = (s1, s2) ->{return s1.concat(s2);};
        String reduce = streamsNomes.reduce(binary).orElse(new String("Teste"));

        System.out.println(reduce);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);  // Usa 0 como identidade

        System.out.println("Soma: " + sum);
        /** Maior para o Menor **/



        Map<String, String> mapa = new HashMap<>();
        mapa.put("Nome", "Pedro");

        System.out.println("teste");








    }
}
