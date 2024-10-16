package br.aula.threads;

public class ConcorrenciaExemplo {

    public static int valor = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() ->{ incrementar();});
        Thread thread2 = new Thread(() ->{ incrementar();});
        Thread thread3 = new Thread(() ->{ incrementar();});
        Thread thread4 = new Thread(() ->{ incrementar();});
        Thread thread5 = new Thread(() ->{ incrementar();});

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        Runnable;



    }

    public static synchronized void incrementar(){
        valor = valor + 1;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(valor + " Thread " + Thread.currentThread().getName());
    }
}
