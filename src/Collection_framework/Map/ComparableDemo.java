package Collection_framework.Map;

import java.util.*;

class Student1 implements Comparable<Student1> {
    private String name;
    private double gpa;

    public Student1(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student1 other) {
        return Double.compare(this.gpa, other.gpa); // sort by GPA ascending
    }

    @Override
    public String toString() {
        return name + " (" + gpa + ")";
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1("Charlie", 3.5));
        list.add(new Student1("Bob", 3.7));
        list.add(new Student1("Alice", 3.5));
        list.add(new Student1("Akshit", 3.9));

        list.sort(null); // uses Comparable
        System.out.println(list);
    }
}
