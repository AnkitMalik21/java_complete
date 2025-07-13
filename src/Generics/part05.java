package Generics;

interface  Container<T>{
    void add(T item);
    T get();
}

// You are hardcoding the type to String, so it's no longer generic.

class StringContainer implements Container<String>{
    private String item;

    @Override
    public void add(String item){
        this.item = item;
    }
    @Override
    public String get(){
        return item;
    }
}

/*
Generic class GenericContainer<T> implements Container<T>`
This retains the flexibility for any type T, hence generic.
*/

class GenericContainer<T> implements Container<T>{
    private T item;

    @Override
    public void add(T item){
        this.item = item;
    }

    @Override
    public T get(){
        return item;
    }
}
public class part05 {
    public static void main(String[] args) {
        StringContainer s = new StringContainer();
        s.add("Ankit");
        System.out.println(s.get());

        GenericContainer<String> t = new GenericContainer<>();
        t.add("kumar Malik");
        System.out.println(t.get());
    }
}
