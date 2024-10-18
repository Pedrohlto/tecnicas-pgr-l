package br.aula.threads;

public class Exercicios {

    public static void main(String[] args) {

//        Thread thread1 = new Thread(() -> {
//            System.out.println("Olá " + Thread.currentThread().getName());
//        });
//
//        Runnable mundo = () ->{ System.out.println("Mundo"  + Thread.currentThread().getName());};
//        Thread thread2 = new Thread(mundo);
//
//        thread1.start();
//        thread2.start();
        Thread timer = new Thread(() -> {
            for (int i = 10; i > 0; i--) {
                System.out.println("Tempo restante: " + i + " segundos");
                try {
                    Thread.sleep(1000); // Aguarda 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Contagem de tempo terminada.");
        });

        timer.start();


//        Thread par = new Thread(() -> {
//            for (int i = 2; i <= 10; i = i + 2) {
//                System.out.println("Número par: " + i);
//            }
//        });
//
//        Thread impar = new Thread(() -> {
//            for (int i = 1; i <= 10; i = i + 2) {
//                System.out.println("Número par: " + i);
//            }
//        });
//
//        par.start();
//        impar.start();




    }
}
