package week3.futureNCallable;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Long> {
    int number;
    Long fact=1L;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        for(int i=2;i<=this.number;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
