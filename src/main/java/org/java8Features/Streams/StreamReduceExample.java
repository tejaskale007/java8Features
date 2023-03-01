package org.java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    static int performMultiplication(List<Integer> integerList){
        return integerList.stream().
                //1
                //3
                //5
                //7
                //a=1,b=1 (from stream)=> result 1 is returned
                //a=1,b=3 => result is 3
                //a=3,b=5 => result 15
                //a=15,b=7 => 105
         reduce(1,(a,b)-> a*b);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println("Multiplication: " + performMultiplication(integers));

        Optional<Integer> integer = integers.stream().reduce((a, b) ->a+b);

    }
}
