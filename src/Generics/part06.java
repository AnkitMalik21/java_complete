package Generics;

/*
A generic interface can have multiple type parameters.
This is useful when you need to
work with more than one type in the same interface.
*/

interface Pair1<K , V>{
    K getKey();
    V getValue();
}

class KeyValuePair<K,V> implements Pair1<K,V>{
    private K key;
    private V value;

    public KeyValuePair(K key,V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey(){
        return key;
    }

    @Override
    public V getValue(){
        return value;
    }
}

public class part06 {
    public static void main(String[] args) {
        Pair1<String,Integer> pair = new KeyValuePair<>("Age",30);
        System.out.println(pair.getKey() + ": " + pair.getValue());
    }
}
