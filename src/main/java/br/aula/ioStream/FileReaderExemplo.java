package br.aula.ioStream;

import java.io.*;

public class FileReaderExemplo {

    public static void main(String[] args) throws IOException {
        File arquivo = new File("nomes2.txt");
        FileReader reader = new FileReader(arquivo);
        BufferedReader buffer = new BufferedReader(reader);
        String conteudo;
        while ((conteudo = buffer.readLine()) != null){
            String[] valores = conteudo.split(",");
            System.out.println(valores[0]);
        }
    }
}
