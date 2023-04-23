package week3.synchronization;

class Counter{
    int count;

    public Counter(){
        this.count = 0;
    }
    void increment(){
        this.count++;
    }

    void printFinalCount(){
        System.out.println(this.count);
    }
}
