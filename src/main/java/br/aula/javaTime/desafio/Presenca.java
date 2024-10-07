package br.aula.javaTime.desafio;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Presenca {

    String nome;
    List<LocalDateTime> entradas;
    List<LocalDateTime> saidas;

    public Presenca(String nome) {
        this.nome = nome;
        this.entradas = new ArrayList<>();
        this.saidas = new ArrayList<>();
    }

    public void adicionarEntradaSaida(LocalDateTime entrada, LocalDateTime saida) {
        entradas.add(entrada);
        saidas.add(saida);
    }

    public Duration calcularTempoTotal() {
        Duration total = Duration.ZERO;
        for (int i = 0; i < entradas.size(); i++) {
            LocalDateTime entrada = entradas.get(i);
            LocalDateTime saida = saidas.get(i);
            total = total.plus(Duration.between(entrada, saida));
        }
        return total;
    }
}
