package br.aula.ioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExemplo {

    public static void main(String[] args) throws IOException {

        File file = new File("nomes2.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] conteudo = fileInputStream.readAllBytes();
        System.out.println(new String(conteudo));
        fileInputStream.close();




        /*System.out.println(file);
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        File[] list = file.listFiles();
        for(File arquivo : list){
            System.out.println(arquivo.getName());
        }*/


    }
}
