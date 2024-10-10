package br.aula.ioStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExemplo {

    public static void main(String[] args) throws IOException {
        File destino = new File("arquivo-destino.txt");
        FileOutputStream output = new FileOutputStream(destino);
        output.write("Escrevendo dentro de um arquivo".getBytes());
        output.close();
    }
}
