package ru.vdovinmb.javaCore2.homeWork7;

import java.util.ArrayList;
import java.util.List;

public class StudentsRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", 1, List.of(2, 3, 4, 3, 4, 3, 2, 3));
        Student student2 = new Student("Ivan", "Petrov", 2, List.of(2, 3, 4));
        Student student3 = new Student("Ivan", "Sidorov", 3, List.of(5, 3));
        Student student4 = new Student("Petr", "Petrov", 4, List.of(2, 3, 4, 3, 4, 3, 5, 5, 5, 3));
        Student student5 = new Student("Anton", "Petrov", 4, List.of(2, 3, 4, 3, 4, 3, 5, 5, 5, 3));
        Student student6 = new Student("Petr", "Sidorov", 5, List.of(2, 3, 4, 3, 4, 3, 5, 5, 5, 3));
        Student student7 = new Student("Sveta", "Ivanova", 4, List.of(2, 3, 4, 3, 5, 5, 5, 3));
        Student student8 = new Student("Masha", "Petrova", 2, List.of(2, 3, 4, 3, 4, 3, 5, 5));


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);

        System.out.println(Student.averageRating(studentList));
        System.out.println(Student.nameSurnameSorted(studentList));//В зависимости от того как переопределен метод toString
                                                                    // будет выполняться второй или третий пункт
    }
}
