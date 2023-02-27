package org.java8Features.methodReference;

import java.util.function.Function;

public class MethodReferenceExample {
    static Function<String,String> toUpperCaseLambda = (s -> s.toUpperCase());
    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("hello"));
        System.out.println(toUpperCaseMethodReference.apply("hello2"));
    }
}
