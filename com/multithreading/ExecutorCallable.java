package com.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class FactorialCalculator implements Callable<Integer> 
{
    private final Integer number;
 
    public FactorialCalculator(Integer number) {
        this.number = number;
    }
 
    @Override
    public Integer call() throws Exception {
 
        int result = 1;
 
        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
 
        System.out.printf("Factorial of %d is :: %d\n", number, result);
        return result;
    }
}

public class ExecutorCallable {

	public static void main(String[] args) throws InterruptedException 
    {
        ExecutorService executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
 
        List<Future<Integer>> resultList = new ArrayList<>();
 
        for (int i = 1; i <= 10; i++) {
            FactorialCalculator calculator = new FactorialCalculator(i);
            Future<Integer> result = executor.submit(calculator);
            resultList.add(result);
        }
         
        executor.awaitTermination(5, TimeUnit.SECONDS);
 
        for (int i = 0; i < resultList.size(); i++) 
        {
            Future<Integer> result = resultList.get(i);
            Integer number = null;
            try {
                number = result.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.printf("Main: Task %d: %d\n", i, number);
        }
 
        executor.shutdown();
    }
}
