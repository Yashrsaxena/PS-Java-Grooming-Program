package week3.synchronization;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        IncrementTask incrementTask1 = new IncrementTask();
        IncrementTask incrementTask2 = new IncrementTask();
        IncrementTask incrementTask3 = new IncrementTask();

        Thread thread1 = new Thread(incrementTask1);
        Thread thread2 = new Thread(incrementTask2);
        Thread thread3 = new Thread(incrementTask3);

            thread1.start();
            thread2.start();
            thread3.start();

        //Will work in synchronized fashion with join
        thread1.join();
        thread2.join();
        thread3.join();
    }
}