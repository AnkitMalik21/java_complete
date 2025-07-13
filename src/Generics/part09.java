package Generics;

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURADAY,SUNDAY
}

class EnumContainer<T extends Enum<T>>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }

    public void printAllConstant(){
        T[] constants = value.getDeclaringClass().getEnumConstants();
        for(T constant: constants){
            System.out.println(constant);
        }
    }
}

public class part09 {
    public static void main(String[] args) {
        EnumContainer<Day> dayContainer = new EnumContainer<>();
        dayContainer.setValue(Day.FRIDAY);

        System.out.println("Stored value: " + dayContainer.getValue());
        System.out.println("All enum constants: ");
        dayContainer.printAllConstant();
    }
}
