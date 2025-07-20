package oops.video2_Method_in_java;

public class part4 {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(new int[]{1,2,3}));//this is redudant
        System.out.println(isPrime(10));
    }
    private static int sum(int ...a){
        //this is called variable args
        int sum= 0;
        for(int i :a){
           sum += i;
        }
        return sum;
    }

    public static boolean isPrime(int x){
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
