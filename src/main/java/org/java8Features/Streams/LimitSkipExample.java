package org.java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitSkipExample {
    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream()
                .limit(2) // will perform the operation only on first two elements
                .reduce((x, y) -> x + y);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                .skip(2) // will skip first 2 elements
                .reduce((x, y) -> x + y);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6, 7, 8, 9);
        Optional<Integer> limitResult = limit(integers);
        if(limitResult.isPresent())
            System.out.println(limitResult.get());
        else
            System.out.println("input not provided");

        Optional<Integer> skipResult = skip(integers);
        if(skipResult.isPresent())
            System.out.println(skipResult.get());
        else
            System.out.println("input not provided");
    }
}
