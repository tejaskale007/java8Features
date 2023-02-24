package org.java8Features.FunctionalInterface.UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {//input and output have the same dataType user UnaryOperator

    static UnaryOperator<String> unaryOperator = (str)->str.concat("Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
