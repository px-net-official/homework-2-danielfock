package at.pxnet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    private final List<Person> students = new ArrayList<>();

    // Default Constructor
    public University() {}

    public void addStudent(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person cannot be null.");
        }
        students.add(person);
    }

    public void removeStudent(Person person) {
        students.remove(person);
    }

    public List<Person> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public List<Person> getFailingStudents() {
        return Collections.unmodifiableList(
                students.stream()
                        .filter(Grading::isFailing)
                        .collect(Collectors.toList())
        );
    }

    public double getAverageAge() {
        if (students.isEmpty()) {
            return 0.0;
        }
        int totalAge = students.stream()
                .mapToInt(Person::getAge)
                .sum();
        return (double) totalAge / students.size();
    }
}
