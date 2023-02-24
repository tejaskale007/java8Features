package org.java8Features.FunctionalInterface.FunctionInJava8;

public class FunctionExample1 {
    public static String performConcat(String str){
       return FunctionExample.function.apply(str);
    }

    public static void main(String[] args) {
        System.out.println("Result: " + performConcat("Hello"));
    }
}
