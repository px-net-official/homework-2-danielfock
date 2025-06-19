package at.pxnet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("1", "Max", 21, new int[]{2, 3, 5});
        Person p2 = new Person("2", "Anna", 22, new int[]{4, 4, 4});
        Person p3 = new Person("3", "John", 19, new int[]{2, 3});
        Person p4 = new Person("4", "Lisa", 20, new int[]{1, 2});

        University uni = new University();
        uni.addStudent(p1);
        uni.addStudent(p2);
        uni.addStudent(p3);
        uni.addStudent(p4);

        System.out.println("All students:");
        for (Person p : uni.getStudents()) {
            System.out.println(p.getName() + ", Age: " + p.getAge() + ", Grades: " + Arrays.toString(p.getGrades()));
        }

        System.out.println("\nFailing students:");
        for (Person p : uni.getFailingStudents()) {
            System.out.println(p.getName());
        }

        System.out.println("\nAverage Age: " + uni.getAverageAge());
    }
}
