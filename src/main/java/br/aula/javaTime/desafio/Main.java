package br.aula.javaTime.desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String arquivoCSV = "registro_alunos_multiplas_entradas.csv";
        Map<String, Presenca> alunos = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            String linha;
            br.readLine();



           while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");
                String nome = valores[0];
                String entradaStr = valores[1];
                String saidaStr = valores[2];

                LocalDateTime entrada = LocalDateTime.parse(entradaStr, formatter);
                LocalDateTime saida = LocalDateTime.parse(saidaStr, formatter);

                var aluno = alunos.getOrDefault(nome, new Presenca(nome));
                aluno.adicionarEntradaSaida(entrada, saida);
                alunos.put(nome, aluno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Duration tempoMinimo = Duration.ofMinutes(135);

        for (Presenca aluno : alunos.values()) {
            Duration tempoTotal = aluno.calcularTempoTotal();
            boolean presente = !tempoTotal.minus(tempoMinimo).isNegative();
            System.out.println("Aluno: " + aluno.nome + " - Presente: " + (presente ? "Sim" : "Não") +
                    " - Tempo Total: " + formatarDuracao(tempoTotal));
        }
    }

    // Método auxiliar para formatar a duração
    private static String formatarDuracao(Duration duracao) {
        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;
        return String.format("%d horas, %d minutos", horas, minutos);
    }
}