package Collection_framework.set;

import java.util.Set;
import java.util.TreeSet;

class Book5 implements Comparable<Book5> {
    int id;
    String name, author, publisher;
    int quantity;

    public Book5(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    // Comparable implementation (by id)
    @Override
    public int compareTo(Book5 b) {
        return Integer.compare(this.id, b.id);
    }
}

public class TreeSetDemo6 {
    public static void main(String[] args) {
        Set<Book5> set = new TreeSet<>();

        // Creating Book5 objects
        Book5 b1 = new Book5(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book5 b2 = new Book5(233, "Operating System", "Galvin", "Wiley", 6);
        Book5 b3 = new Book5(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

        // Adding to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);

        // Traversing TreeSet
        for (Book5 b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
