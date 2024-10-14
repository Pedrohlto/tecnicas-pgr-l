package br.aula.ioStream.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathExmeplo {

    public static void main(String[] args) throws IOException {

        Path caminhoNovo = Path.of("nomes2.txt");
        var linhasArquivos = Files.readAllLines(caminhoNovo);
        linhasArquivos.forEach((linha) -> {
            System.out.println(linha);
        });

    }
}
