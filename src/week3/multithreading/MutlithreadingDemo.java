package week3.multithreading;

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
