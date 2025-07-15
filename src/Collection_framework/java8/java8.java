package Collection_framework.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;

@FunctionalInterface
interface MathOperation{
    int operate(int a,int b);
}

class MobilePhone{
    String name;
    public MobilePhone(String name){
        this.name = name;
    }
}
public class java8 {

    public static void main(String[] args) {
        // Streams

        // Java 8 --> minimal code, functional programing
        // Java 8 --> lambda expression, Streams, Date & Time API

        // lambda expression
        // lambda expression is an anonymous function ( no name, no return type, no access modifier )

        Thread t1 = new Thread(()->{
            System.out.println("hello");
        });

        //fuctional interface

        MathOperation sumOperation = (a,b)->a+b;
        MathOperation subOperation = ( a,b )->a-b;

        int res = sumOperation.operate(1,3);
        System.out.println(res);

        int res1 = subOperation.operate(10,4);
        System.out.println(res1);

        // Predicate --> Functional interface ( Boolean valued function )
        Predicate<Integer> isEven = x->x % 2==0;
        System.out.println(isEven.test(4));//true

        Predicate<String> isWordStartWithA = x->x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndWithA = x->x.toLowerCase().endsWith("a");

        //combine
        Predicate<String> str = isWordEndWithA.and(isWordEndWithA);
        System.out.println(str.test("Akaya"));


        //Fuction works for you
        Function<Integer,Integer> doubleIt = x->2 * x;
        Function<Integer,Integer> tripleIt = x->3 * x;

        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(tripleIt.andThen(doubleIt).apply(32));//same
        System.out.println(doubleIt.compose(tripleIt).apply(32));//same

        Function<Integer,Integer> identity = Function.identity();//identity return is input argument
        Integer res2 = identity.apply(100);
        System.out.println(res2);


        //Consumer
        Consumer<Integer> print = x-> System.out.println(x);
        print.accept(51);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x->{
            for(int i : x){
                System.out.println(i);
            }
        };

        printList.accept(list);

        //Supplier
        Supplier<String> giveHelloWorld = ()->"Hello World";
        System.out.println(giveHelloWorld.get());

        //combined example
        Predicate<Integer> predicate = x ->x%2 == 0;
        Function<Integer,Integer> function = x ->x*x;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Supplier<Integer> supplier = ()->100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        // BiPredicate, BiConsumer, BiFunction

        BiPredicate<Integer,Integer> isSumEven = (x,y)->(x+y) % 2 == 0;
        System.out.println(isSumEven.test(5,5));
        BiConsumer<Integer,String> biConsumer = (x,y)->{
            System.out.println(x);
            System.out.println(y);
        };

        BiFunction<String,String,Integer> biFunction = (x,y)->(x+y).length();
        System.out.println(biFunction.apply("a","bc"));

        //UnaryOperator ,BinaryOperator

        /*
        Represents an operation on a single operand that produces
        a result of the same type as its operand. This is a specialization
        of Function for the case where the operand and result are of the same type
       */

        UnaryOperator<Integer> a = x -> 2*x;
        System.out.println(a);
        BinaryOperator<Integer> b = (x,y)->x + y;//operand and output are of same type

        //Method-reference --> use method without invoking & in place of lamba express
        List<String> students  = Arrays.asList("RAM","SHYAM","GHANSHYAM");
        students.forEach(x-> System.out.println(x));
        students.forEach(System.out::println);

        //Constructor reference
        List<String> names = Arrays.asList("A","B","C");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());
    }

}
