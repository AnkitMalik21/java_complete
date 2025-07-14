package Collection_framework.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class part7 {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student("Charlie",3.8));
        student.add(new Student("Blice",3.5));
        student.add(new Student("Alice",3.5));
        student.add(new Student("Ankit",3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa)
                .reversed().thenComparing(Student::getName);

        student.sort(comparator);

        for(Student s:student){
            System.out.println(s.getName() + ": " + s.getGpa());
        }
    }
}
