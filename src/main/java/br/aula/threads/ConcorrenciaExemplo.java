package br.aula.threads;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcorrenciaExemplo {

    /** Thread - Safe */
    public static AtomicInteger valor = new AtomicInteger(0);

    /** Thread - Safe */
    public static List<String> listaCompartilhada = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        MeuRunnable runnable = new MeuRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(1000);
        listaCompartilhada.forEach(System.out::println);

    }

    public static class MeuRunnable implements Runnable {
        @Override
        public void run() {
            listaCompartilhada.add("Novo Valor Lista " + Thread.currentThread().getName());
            System.out.println(" Thread " + Thread.currentThread().getName() + " " + valor.incrementAndGet());
        }
    }
}
