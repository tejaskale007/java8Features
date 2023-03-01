package org.java8Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxExample {
    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a > b ? a : b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();//Arrays.asList(4, 5, 6, 7);
        int maxValue = findMaxValue(integerList);
        System.out.println("Max Value: " + maxValue);

        integerList = Arrays.asList(4, 5, 6, 7);
        Optional<Integer> integer = findMaxValueOptional(integerList);
        if(integer.isPresent()){
            System.out.println("\nmax value: " + integer.get());
        }
        else{
            System.out.println("\nvalue present : " + integer.isPresent() + " or empty list passed");
        }
    }
}
