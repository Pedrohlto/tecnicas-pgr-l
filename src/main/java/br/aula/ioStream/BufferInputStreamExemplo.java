package br.aula.ioStream;

import java.io.*;

public class BufferInputStreamExemplo {
    public static void main(String[] args) throws IOException {
        File file = new File("nomes2.txt");
        FileInputStream input = new FileInputStream(file);
        BufferedInputStream buffer = new BufferedInputStream(input);

        int conteudo = 0;
        while((conteudo = buffer.read()) != -1 ){
            System.out.println((char) conteudo);
        }
        buffer.close();
        input.close();

    }
}
