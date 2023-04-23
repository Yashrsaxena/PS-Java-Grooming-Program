package week3.futureNCallable;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureImplementation {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Enter Number to find its FACTORIAL: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        FactorialCalculator factorialCalculator = new FactorialCalculator(number);
        Future<Long> future= executorService.submit(factorialCalculator);
        executorService.shutdown();
        Long result = future.get();
        System.out.println("The factorial of "+number+" is "+result);
    }
}
