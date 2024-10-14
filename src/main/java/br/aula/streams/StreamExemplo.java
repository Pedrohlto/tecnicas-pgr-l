package br.aula.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class StreamExemplo {

    public static void main(String[] args) throws IOException {
        Path arquivo = Path.of("nomes2.txt");
        List<String> strings = Files.readAllLines(arquivo);
        Stream<String> stream = strings.stream();
//
//        stream.filter(nome -> {
//                    return nome.contains("a");
//                })
//                .filter(nome -> {
//                    return nome.startsWith("P");
//                })
//                .map(nome -> new Usuario((nome)))
//                .collect(Collectors.toMap(usuario -> usuario.getId(), usuario -> usuario.getNome()))


//        Stream<String> p = stream.filter(nome -> nome.contains("p"));
//
//        p.forEach(nome ->{
//            System.out.println(nome);
//        });
//        Stream<String> stream = strings.stream();
//        var streamUsuario = stream.map(nome -> {return new Usuario (nome);});
//
//        streamUsuario.forEach(usuario -> {
//            System.out.println(usuario.getNome());
//        });

//            List<String> lista = List.of( "Vitoria","Pedro", "Pedro", "Henrique", "Maria", "João");
//            Stream<String> stream = lista.stream();
//            Stream<String> sorted = stream.sorted(Comparator.comparingInt(nome -> nome.length())).skip(2);
//
//
//        sorted.forEach(nome ->{
//                System.out.println(nome);
//            });

        List<Integer> integers = List.of(5, 90, 50, 60, 80, 74, 76, 3);

//        Optional<Integer> min = integers.stream().min(Comparator.comparingInt(Integer::intValue));
//        min.ifPresent(numeroMinimo ->{
//            System.out.println(numeroMinimo);
//        });

//        Optional<Integer> max = integers.stream().max(Comparator.comparingInt(Integer::intValue));
//        max.ifPresent(numeroMinimo ->{
//            System.out.println(numeroMinimo);
//        });


        Stream<Integer> streamInteiros = integers.stream();

        Integer reduce = streamInteiros.reduce(0, (a, b) -> a + b);
        System.out.println(reduce);




    }
}
