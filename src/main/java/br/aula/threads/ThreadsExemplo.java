package br.aula.threads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ThreadsExemplo {

    public static void main(String[] args) throws InterruptedException {

        long l = System.currentTimeMillis();

        Thread thread1 = new Thread(() -> {
            var linhas = leituraArquivo("nomes2.txt");
            linhas.forEach(linha -> System.out.println(linha));
        });

        Thread thread2 = new Thread(() -> {
            var linhas = leituraArquivo("nomes2.txt");
            linhas.forEach(linha -> System.out.println(linha));
        });

        Thread thread3 = new Thread(() -> {
            var linhas = leituraArquivo("nomes2.txt");
            linhas.forEach(linha -> System.out.println(linha));
        });

        Thread thread4 = new Thread(() -> {
            var linhas = leituraArquivo("nomes2.txt");
            linhas.forEach(linha -> System.out.println(linha));
        });

        Thread thread5 = new Thread(() -> {
            var linhas = leituraArquivo("nomes2.txt");
            linhas.forEach(linha -> System.out.println(linha));
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        /*List<String> linhas = leituraArquivo("nomes2.txt");
        linhas.forEach(linha -> System.out.println(linha));

        List<String> linhas2 = leituraArquivo("nomes2.txt");
        linhas2.forEach(linha -> System.out.println(linha));

        List<String> linhas3 = leituraArquivo("nomes2.txt");
        linhas3.forEach(linha -> System.out.println(linha));

        List<String> linhas4 = leituraArquivo("nomes2.txt");
        linhas4.forEach(linha -> System.out.println(linha));

        List<String> linhas5 = leituraArquivo("nomes2.txt");
        linhas5.forEach(linha -> System.out.println(linha));*/

        Thread.sleep(2000);
        var fim = System.currentTimeMillis();

        System.out.println("Tempo " + (fim - l)/1000 );

    }

    public static List<String> leituraArquivo(String nomeArquivo) {
        Path caminhoArquivo = Path.of(nomeArquivo);
        List<String> linhas = new ArrayList<>();
        try {
            linhas = Files.readAllLines(caminhoArquivo);
            Thread.sleep(1000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return linhas;
    }

}
