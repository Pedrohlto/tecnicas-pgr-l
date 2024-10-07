package br.aula.lambda.exercicios.operacoes;

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        // Operações utilizando expressões lambda
        Operacao soma = (a, b) -> a + b;
        Operacao subtracao = (a, b) -> a - b;
        Operacao multiplicacao = (a, b) -> a * b;
        Operacao divisao = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                return Double.NaN; // Indicando que é uma divisão por zero
            }
        };

        System.out.println("Soma: " + soma.calcular(num1, num2));
        System.out.println("Subtração: " + subtracao.calcular(num1, num2));
        System.out.println("Multiplicação: " + multiplicacao.calcular(num1, num2));
        System.out.println("Divisão: " + divisao.calcular(num1, num2));
    }
}
