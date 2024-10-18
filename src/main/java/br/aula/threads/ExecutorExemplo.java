package br.aula.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExemplo {

    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        executor.execute(() ->{
//            System.out.println(" Nova Thread " + Thread.currentThread().getName());
//        });

        Runnable task = () ->{
            try {
                Thread.sleep(2000);
                System.out.println("Executando " + Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        //ExecutorService executor = Executors.newFixedThreadPool(5);

        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.execute(task);
        executor.execute(task);

        if(!executor.awaitTermination(1, TimeUnit.SECONDS)){
            executor.shutdownNow();
        };
        executor.shutdown();

//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);
//        executor.execute(task);


    }

}
