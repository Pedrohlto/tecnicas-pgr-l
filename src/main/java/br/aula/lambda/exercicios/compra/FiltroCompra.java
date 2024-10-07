package br.aula.lambda.exercicios.compra;

@FunctionalInterface
public interface FiltroCompra {
    boolean test(Compra compra);
}
