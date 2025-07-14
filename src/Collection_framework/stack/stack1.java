package Collection_framework.stack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);//1 2 3 4 5 6
        Integer removeElement = stack.pop();
        System.out.println(stack);//1 2 3 4 5

        Integer peek = stack.peek();//see the top element of stack
        System.out.println(peek);
        System.out.println(stack);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(3);
        System.out.println(search);


        //Linkedlist as stack

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        System.out.println(linkedList.getLast());//peek
        System.out.println(linkedList.removeLast());//pop
        System.out.println(linkedList.size());//size
        System.out.println(linkedList.isEmpty());

       //ArrayList as stack
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.get(arrayList.size()-1);//peek
        arrayList.remove(arrayList.size()-1);//pop


    }
}
