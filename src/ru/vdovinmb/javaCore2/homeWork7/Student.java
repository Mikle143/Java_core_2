package ru.vdovinmb.javaCore2.homeWork7;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private final String name;
    private final String surname;
    private final int courseNumber;
    private final List<Integer> ratings;

    public Student(String name, String surname, int courseNumber, List<Integer> ratings) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    static Map<Integer, Double> averageRating(List<Student> studentList) {
        studentList = studentList.stream().filter(student -> {
                    return student.ratings.size() > 3;
                }).
                collect(Collectors.toList());  //Отфильтровал студентов по количеству оценок
        return studentList.stream().
                collect(Collectors.
                        groupingBy(Student::getCourseNumber, Collectors.
                                averagingDouble(student -> student.getRatings().stream().
                                        mapToDouble(Integer::doubleValue)
                                        .average()
                                        .orElse(0))));
    }

    static Map<Integer, List<Student>> nameSurnameSorted(List<Student> studentList) {

        return studentList.stream().
                sorted(Comparator.comparing(Student::getName).thenComparing(Student::getSurname)).
                collect(Collectors.groupingBy(Student::getCourseNumber, Collectors.toList()));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", AverageRatings=" + ratings.stream().mapToDouble(Integer::doubleValue).average() +
                '}';
    }
}
