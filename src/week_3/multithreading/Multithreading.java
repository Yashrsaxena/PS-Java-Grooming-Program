package week_3.multithreading;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        MultithreadingDemo thread1 = new MultithreadingDemo();
        MultithreadingDemo thread2 = new MultithreadingDemo();

        //Thread start statement
        thread1.start();
        thread2.start();
    }
}

class MultithreadingDemo extends Thread{
    @Override
    public void run(){
        for(int i=0;i<3;i++)
        {
            System.out.println("Thread "+Thread.currentThread().threadId()+" is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}