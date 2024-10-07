package br.aula.lambda.exercicios.compra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando uma lista de compras para teste
        List<Compra> compras = new ArrayList<>();
        compras.add(new Compra(50.0, true));
        compras.add(new Compra(30.0, false));
        compras.add(new Compra(100.0, true));
        compras.add(new Compra(20.0, false));

        // Filtrando apenas as compras pagas utilizando expressão lambda
        List<Compra> comprasPagas = filtrarCompras(compras, compra -> compra.isPaga());

        // Imprimindo as compras pagas
        System.out.println("Compras Pagas:");
        for (Compra compra : comprasPagas) {
            System.out.println("Valor: " + compra.getValor());
        }
    }

    // Método para filtrar as compras com base no filtro fornecido
    public static List<Compra> filtrarCompras(List<Compra> compras, FiltroCompra filtro) {
        List<Compra> comprasFiltradas = new ArrayList<>();
        for (Compra compra : compras) {
            if (filtro.test(compra)) {
                comprasFiltradas.add(compra);
            }
        }
        return comprasFiltradas;
    }
}
