package Practice.FutureAndCompletableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class FutureAndCompletableFuture{
    public static void fibonacci(Integer count){
        List<Integer> list = new ArrayList<>();
        Integer n1=0,n2=1,n3;
        list.add(n1);
        list.add(n2);
        for(int i=2;i<=count;i++)
        {
            n3 = n1+n2;
            list.add(n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(list);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newSingleThreadExecutor();
        long start1 = System.nanoTime();
        Future<List<Integer>> future = es.submit(()->{//Fibonacci Series Program
            fibonacci(20);
            fibonacci(30);
            fibonacci(40);
            return null;
        });
        System.out.println(future.get());
        es.shutdown();
        long end1 = System.nanoTime();
        System.out.println("Time Taken: "+(end1-start1)+" ms");


        ExecutorService es1 = Executors.newFixedThreadPool(3);
        long start2 = System.nanoTime();
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(new Supplier<Void>() {
            @Override
            public Void get() {
                fibonacci(20);
                fibonacci(30);
                fibonacci(40);
                return null;
            }
        }, es1);

// Block and wait for the future to complete
        completableFuture.get();
        long end2 = System.nanoTime();
        System.out.println("Time Taken: "+(end2-start2)+" ms");
        es1.shutdown();
    }
}
