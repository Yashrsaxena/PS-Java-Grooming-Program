package Practice.AnonymousInnerClass;

//Functional interface can contain single abstract method but multiple static method
//Future will block the main thread forever until one api call gives the result
//We cannot stop the Future submission
//Future doesn't allow parallel processing but CompletableFuture does with supply async

//Stream with 100 entries 5-6 functions for String processing
//array of fibonacci series of Array(20, 30, 40) until [20, 30, 40] with future and completableFuture also print the time

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class AnonymousInnerClass {

    interface Test{ // Functional Interface
        void print();
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Test v = ()->{ // Anonymous Inner Class
            System.out.println("Hello");
        };

        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream = list.stream();


    }
}
