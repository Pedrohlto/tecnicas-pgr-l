package br.aula.ioStream;

import java.io.*;

public class BufferedOutputStreamExemplo {
    public static void main(String[] args) throws IOException {
        File destino = new File("arquivo-destino2.txt");
        FileOutputStream output = new FileOutputStream(destino);
        BufferedOutputStream buffer = new BufferedOutputStream(output);
        buffer.write("Outro tipo de Texto".getBytes());
        buffer.close();
        output.close();
    }
}
