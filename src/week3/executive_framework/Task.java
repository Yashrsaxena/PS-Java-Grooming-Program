package week3.executive_framework;

//creating Task1 class that implements the Runnable interface
public class Task implements Runnable {

    //initialize threadNo variable
    private String taskNo;

    //using constructor to set value to the threadNo variable
    public Task(String no){
        this.taskNo = no;
    }

    //using run() method by overriding it
    @Override
    public void run() {
        //printing thread information
        System.out.println("Task "+this.taskNo+" on Thread "+Thread.currentThread().getName()+" is running");
    }
}