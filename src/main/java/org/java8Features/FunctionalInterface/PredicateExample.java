package org.java8Features.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> isPrimePredicate = (i)-> i%2==0;
    static Predicate<Integer> isDivisibleByFive = (i)-> i%5==0;


    public static void predicateAnd(){
        System.out.println("predicateAnd " +isPrimePredicate.and(isDivisibleByFive).test(15));//predicateChaining
        System.out.println("predicateAnd "+isPrimePredicate.and(isDivisibleByFive).test(20));//predicateChaining
    }

    public static void predicateOr(){
        System.out.println("predicateOr " +isPrimePredicate.or(isDivisibleByFive).test(15));//predicateChaining
        System.out.println("predicateOr "+isPrimePredicate.or(isDivisibleByFive).test(20));//predicateChaining
    }

    public static void predicateNegate(){
        System.out.println("predicateNegate " +isPrimePredicate.or(isDivisibleByFive).negate().test(15));//predicateChaining
        System.out.println("predicateNegate "+isPrimePredicate.or(isDivisibleByFive).negate().test(20));//predicateChaining
    }
    public static void main(String[] args) {
        System.out.println(isPrimePredicate.test(34));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
