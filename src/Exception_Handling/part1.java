package Exception_Handling;

/*
types of error in java

syntax error
logical error
runtime error

*/

//this will generate a arithmetic exception
// this will runtime exception
//abrupt stoppage to code

public class part1 {
    public static void main(String[] args) {
        int[] numerator = {10,200,30,40};
        int[] denominator = {1,2,0,4};
        for(int i=0;i<numerator.length;i++){
            System.out.println(divide(numerator[i],denominator[i]));
        }
        System.out.println("Good job: ");
    }

    public static int divide(int a,int b){
        return a/b;
    }
}
