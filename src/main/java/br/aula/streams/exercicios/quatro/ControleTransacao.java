package br.aula.streams.exercicios.quatro;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ControleTransacao {

    public static void main(String[] args) {

        List<Transaction> transactions = List.of(new Transaction(10.50, "PIX"),
                new Transaction(11.50, "PIX"),
                new Transaction(12.50, "DEBITO"),
                new Transaction(13.50, "CREDITO"),
                new Transaction(14.50, "DEBITO"));

        Map<Object, Double> collect = transactions.stream().collect(Collectors.groupingBy(transaction -> transaction.getTipo(),
                Collectors.summingDouble(transaction -> transaction.getValor())));

        collect.forEach((chave, valor) ->{
            System.out.println("Tipo " + chave + " Valor " + valor);
        });

    }
}
