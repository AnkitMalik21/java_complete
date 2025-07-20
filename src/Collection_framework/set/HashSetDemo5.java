package Collection_framework.set;

import java.util.HashSet;
import java.util.Iterator;

class Person{
   private String name;
   private int age;
   public Person(String name,int age){
       this.name = name;
       this.age = age;
   }

   @Override
    public boolean equals(Object o){
       if(this == o ) return true;
       if(o == null || getClass()!=o.getClass()) return false;
       Person p =(Person) o;
       return age == p.age && name.equals(p.name);
   }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class HashSetDemo5 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        //adding element to the hashset
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

         //Display the hashSet
        System.out.println("HashSet: " + hashSet);
        // Iterate over the HashSet using an Iterator
        System.out.print("Iterating over the HashSet using Iterator: ");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        // Convert HashSet to an array
        String[] array = hashSet.toArray(new String[0]);
        System.out.print("HashSet converted to array: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        // Create a HashSet of custom objects
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        // Display the HashSet of custom objects
        System.out.println("HashSet of custom objects: " + personSet);
    }
}
