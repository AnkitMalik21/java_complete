package Generics;

//class Box{
//    private Object value;
//
//    public Object getValue(){
//        return value;
//    }
//    public void setValue(Object value){
//        this.value=value;
//    }
//}
//
//public class part03 {
//    public static void main(String[] args) {
//        Box b = new Box();
//        b.setValue(1);
//        String i = (String) b.getValue();//this will throw error
//        System.out.println(i);
//    }
//}

// the above one class will throw error because it is not a generic class

class Box<T>{
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

public class part03 {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(); //box is now a type-safe
        box.setValue(1);// it is an integer
        Integer i = box.getValue();//not issue,it's an integer
        System.out.println(i);//no casting needed
    }
}