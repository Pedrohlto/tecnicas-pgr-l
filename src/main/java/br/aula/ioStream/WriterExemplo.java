package br.aula.ioStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterExemplo {
    public static void main(String[] args) throws IOException {
        File file = new File("Arquivo-destino.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Texto");
        writer.close();

    }
}
