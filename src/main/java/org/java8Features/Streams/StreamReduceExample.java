package org.java8Features.Streams;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    static int performMultiplication(List<Integer> integerList) {
        return integerList.stream().
                //1
                //3
                //5
                //7
                //a=1,b=1 (from stream)=> result 1 is returned
                //a=1,b=3 => result is 3
                //a=3,b=5 => result 15
                //a=15,b=7 => 105
                        reduce(2, (a, b) -> a * b);
    }

    static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream().reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                //students one by one
                .reduce((s1, s2) -> {
            if (s1.getGpa() > s2.getGpa()) {
                return s1;
            } else {
                return s2;
            }
        });
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        System.out.println("\nMultiplication: " + performMultiplication(integers));

        Optional<Integer> integer = performMultiplicationWithoutIdentity(integers);
        System.out.println("\nMultiplication value present: " + integer.isPresent());
        System.out.println("Multiplication without Identity: " + integer.get());


        Optional<Student> student = getHighestGPAStudent();
        if(getHighestGPAStudent().isPresent()){
            System.out.println("\n\nStudent with highestGPA" + student.get());
        }
    }
}
