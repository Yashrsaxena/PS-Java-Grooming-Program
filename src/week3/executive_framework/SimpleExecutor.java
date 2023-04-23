package week3.executive_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//creating SimpleExecutor class
public class SimpleExecutor {
    //main() method start
    public static void main(String[] args) {
        //creating an object of ExecutorService with fixed thread pool 5
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int j = 1; j <= 5; j++) {
            //creating instance of the Task class and pass a value to its constructor
            Runnable task = new Task(Integer.toString(j));

            //submitting task using submit() method of the executor
            executorService.submit(task);
        }
        //closing executor
        executorService.shutdown();

        while (!executorService.isTerminated());
        System.out.println("Finished all threads");
    }
}