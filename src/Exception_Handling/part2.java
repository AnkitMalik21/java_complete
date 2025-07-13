package Exception_Handling;

//every class in java extends the object class
//and object class has toString() method

public class part2 {
    public static void main(String[] args) {
        int[] numerator = {10,200,30,40};
        int[] denominator = {1,2,0,4};
        for(int i=0;i<10;i++){
             try{
                 System.out.println(divide(numerator[i],denominator[i]));
             }catch (IndexOutOfBoundsException e){
                 System.out.println(e);
             }
        }
        System.out.println("Good job: ");
    }

    public static int divide(int a,int b){
        try {
            return a/b;
        }catch (ArithmeticException e){
            //we can also use Exception instead of arithmetic exception
            //the message is thrown by toString method
            System.out.println(e);
        }
        return -1;
    }
}


// we can use multiple exception
//but base class should be used below subclass exception

