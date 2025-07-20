package oops.video3_recursion;
//recursion
//when a function call itself

public class part1 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sumOfNaturalNumbers(5));
    }

    /*
    public static int factorial(int n){
        int res = 1;
        for(int i=2;i<=n;i++){
            res *= i;
        }
        return res;
    }
    */

    public static int factorial(int n){
        if(n==1 || n==0){
            return n;
        }
        return n * factorial(n-1);
    }

    public static int sumOfNaturalNumbers(int n){
        if(n>=1){
            return n + sumOfNaturalNumbers(n-1);
        }
        return 0;
    }
}
