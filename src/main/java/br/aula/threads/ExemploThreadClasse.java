package br.aula.threads;

public class ExemploThreadClasse {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("Thread 2 " + Thread.currentThread().getName());
        }, "Thread - nova");

        thread.start();

        System.out.println(Thread.currentThread().getName());
    }
}
