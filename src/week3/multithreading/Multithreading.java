package week3.multithreading;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        MultithreadingDemo thread1 = new MultithreadingDemo();
        MultithreadingDemo thread2 = new MultithreadingDemo();

        //Thread start statement
        thread1.start();
        thread2.start();
    }
}

