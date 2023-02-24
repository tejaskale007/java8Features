package org.java8Features.FunctionalInterface;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name,activities)-> System.out.println(name+ " : " + activities);
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));
    }

    public static void main(String[] args) {
        BiConsumer<String , String> biConsumer = (firstString,secondString)->{
            System.out.println(firstString);
            System.out.println(secondString);
        };

        biConsumer.accept("firstString","secondString");

        BiConsumer<Integer, Integer> multiplicationConsumer = (firstNumber, secondNumber) -> {
            System.out.println("Multiplication is: " + firstNumber * secondNumber);
        };

        BiConsumer<Integer, Integer> divisionConsumer = (firstNumber, secondNumber) -> {
            System.out.println("Division is: " + firstNumber / secondNumber);
        };

        multiplicationConsumer.andThen(divisionConsumer).accept(3,2);

        nameAndActivities();
    }
}
