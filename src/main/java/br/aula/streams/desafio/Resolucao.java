package br.aula.streams.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Resolucao {

    public static void main(String[] args) throws IOException {
        var vendas = lerArquivo();

        double sum = vendas.stream().mapToDouble(venda -> venda.getQuantidadeVendida() * venda.getPrecoUnitario())
                .sum();

        Map<String, Integer> collect = vendas.stream()
                .collect(Collectors.groupingBy(venda -> venda.getProduto()
                        , Collectors.summingInt(venda -> venda.getQuantidadeVendida())));

        Set<Map.Entry<String, Integer>> entries = collect.entrySet();

        entries.stream().max(Map.Entry.comparingByValue())
                .map((entrada) ->  entrada.getKey())
                .ifPresent(produto -> System.out.println(produto));


        System.out.println("vendas");

    }

    public static List<Venda> lerArquivo() throws IOException {
        List<Venda> vendas = new ArrayList<>();

        try (BufferedReader buffer = new BufferedReader(new FileReader("vendas.csv"))) {
            vendas = buffer.lines()
                    .skip(1)
                    .map(linha -> {
                        String[] campos = linha.split(",");
                        return new Venda(campos[0],
                                campos[1],
                                campos[2],
                                Integer.parseInt(campos[3]),
                                Double.parseDouble(campos[4].concat(".").concat(campos[5])),
                                campos[6]);
                    })
                    .collect(Collectors.toList());
        }
        return vendas;
    }


}
