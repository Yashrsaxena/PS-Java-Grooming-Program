package week3.synchronization;

class IncrementTask implements Runnable{
    Counter counter = new Counter();
    @Override
    public void run(){
        for (int i=0;i<5;i++) {
            counter.increment();
        }
        counter.printFinalCount();
    }
}