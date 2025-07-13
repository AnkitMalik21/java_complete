package Generics;

/*
Type Parameters and Bounded Types in Interfaces

Just like generic classes, you can use bounded type parameters in generic
interfaces to restrict the types that can be used as arguments.

In this example, the type parameter T is restricted to subclasses of Number,
so only numeric types like Integer, Double, etc., can be used.
*/



interface NumberContainer<T extends Number>{
    void add(T items);
    T get();
}

class IntegerContainer implements NumberContainer<Integer>{
    private Integer item;

    @Override
    public void add(Integer item){
        this.item = item;
    }

    @Override
    public Integer get(){
        return item;
    }
}

/*
Attempting to implement the NumberContainer interface
with a non-numeric type (like String)
would result in a compile-time error.
*/

public class part07 {
    public static void main(String[] args) {
        IntegerContainer num = new IntegerContainer();
        num.add(12);
        System.out.println(num.get());

    }
}
