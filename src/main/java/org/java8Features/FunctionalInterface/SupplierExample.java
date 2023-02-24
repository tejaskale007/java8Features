package org.java8Features.FunctionalInterface;

import org.java8Features.data.Student;
import org.java8Features.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = ()-> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
        System.out.println("Student is: " + studentSupplier.get());//supplier does't take any input, but returns when .get() is called
        Supplier<List<Student>> listSupplier = ()-> StudentDataBase.getAllStudents();

        System.out.println("Student List: " + listSupplier.get());
    }
}
