package org.java8Features.FunctionalInterface;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentConsumer = (student)-> System.out.println(student);
    static Consumer<Student> studentNameConsumer = (student)-> System.out.println(student.getName());
    static Consumer<Student> studentActivityConsumer = (student)-> System.out.println(student.getActivities());

    public static void printName(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(studentConsumer);
    }

    public static void printNameActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        //first it will print StudentName then activityConsumer
        studentList.forEach(studentNameConsumer.andThen(studentActivityConsumer));
    }

    public static void printNameActivitiesUsingCondition(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3) {
                studentNameConsumer.andThen(studentActivityConsumer).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s -> System.out.println(s.toUpperCase()));
        c1.accept("java8");//using accept we pass the input
//        printName();
//        printNameActivities();
        printNameActivitiesUsingCondition();
    }
}
