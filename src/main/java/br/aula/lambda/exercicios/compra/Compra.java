package br.aula.lambda.exercicios.compra;

public class Compra {

    private double valor;
    private boolean paga;

    public Compra(double valor, boolean paga) {
        this.valor = valor;
        this.paga = paga;
    }

    public boolean isPaga() {
        return paga;
    }

    public double getValor() {
        return valor;
    }
}