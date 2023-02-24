package org.java8Features.LambdaExamples;

public class ImplementingRunnable {
    public static void main(String[] args) {
        //enabling functional programming,
        // able to pass function as a value to param
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
