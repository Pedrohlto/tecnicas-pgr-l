package br.aula.ioStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputExemplo {

    public static void main(String[] args) throws IOException {
        byte[] conteudo = "Frase Qualquer".getBytes();
        ByteArrayInputStream input = new ByteArrayInputStream(conteudo);
        int byteIndividual = 0;
        while((byteIndividual = input.read()) != -1){
            System.out.println((char) byteIndividual);
        }
        input.close();
    }
}
