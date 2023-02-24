package org.java8Features.LambdaExamples;

@FunctionalInterface
interface interf{
    int getLength(String s);
}
public class LambdaExample {
    public static void main(String[] args) {
        interf i = (s)-> s.length();
        System.out.println(i.getLength("Hello"));
    }
}
