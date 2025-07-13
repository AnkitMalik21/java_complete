package Generics;


enum Operation{
    ADD,SUBTRACT,MULTIPLY,DIVIDE;

    public<T extends Number> double apply(T a,T b){
        switch(this){
            case ADD:
                return a.doubleValue() + b.doubleValue();

            case  SUBTRACT:
                return a.doubleValue() - b.doubleValue();

            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();

            case DIVIDE:
                return a.doubleValue() / b.doubleValue();

            default:
                throw new AssertionError("Unknown operation: " + this);
        }
    }
}
public class part10 {
    public static void main(String[] args) {
        double result1 = Operation.ADD.apply(10,20);
        double result2 = Operation.MULTIPLY.apply(5.5,4);

        System.out.println(result1);
        System.out.println(result2);
    }
}
