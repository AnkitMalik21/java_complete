package Generics;


//wildcard in generics

// Generic container interface
interface Container1<T> {
    void add(T item);
    T get();
}

// Concrete generic class
class GenericContainer1<T> implements Container1<T> {
    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

// Class using wildcard
class WildCardExample {
    public static void printContainer(Container1<?> container) {
        System.out.println(container.get());
    }
}

// Employee class
class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Correct compareTo method
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

// Main class
public class part08 {
    public static void main(String[] args) {
        GenericContainer1<String> stringContainer = new GenericContainer1<>();
        stringContainer.add("Hello Generics!");

        GenericContainer1<Employee> employeeContainer = new GenericContainer1<>();
        employeeContainer.add(new Employee("Ankit", 25));

        // Using wildcard method
        WildCardExample.printContainer(stringContainer);       // Output: Hello Generics!
        WildCardExample.printContainer(employeeContainer);     // Output: Ankit (25)
    }
}
