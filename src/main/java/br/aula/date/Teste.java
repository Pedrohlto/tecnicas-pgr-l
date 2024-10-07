package br.aula.date;

import java.util.Date;

public class Teste {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getYear());
        date.setDate(10);
        date.setYear(1995);
        System.out.println(date);
    }
}
