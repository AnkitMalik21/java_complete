package Collection_framework.LinkedList;

//  it uses doubly linked list implementation
// has a node -> contain data and pointer
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        //Adding element
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //accessing an element O(n)
        linkedList.get(2);

        //Adding at the begining nad end O(1) time
        linkedList.addFirst(21);
        linkedList.addFirst(12);

        System.out.println("Last element: " + linkedList.getLast());
        System.out.println("LinkedList before removal: " + linkedList);

        // REMOVE ELEMENTS BASED ON CONDITION
        linkedList.removeIf(x->x%2==0);
        System.out.println("LinkedList after removing even elements: " + linkedList);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        System.out.println(animal);

        LinkedList<String> animalToRemove = new LinkedList<>(Arrays.asList("Dog","Lion"));

        //Removing all elements in animalToRemove
        animal.removeAll(animalToRemove);
        System.out.println("Animals after removal: "  +animal);


    }
}
