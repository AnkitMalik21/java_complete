package oops.Method_in_java;

public class part1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        sumOfArray(a);

        int[] b = {1,2,3,4,5,6,7};
        sumOfArray(b);

        String res = "ankit";
        System.out.println(Upperfun(res));
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,20));

    }
    public static void sumOfArray(int[] arr){
        int res = 0;
        for(int i:arr){
            res +=i;
        }
        System.out.println(res);
    }

    private static String Upperfun(String str){
        return str.trim().toUpperCase();
    }

    private static int sum(int a,int b){
        return a+b;
    }
    //this is method overloading
    private static int sum(int a,int b,int c){
        return a+b+c;
    }

    //if name is same and agrument type is different then still it overloading
    private static float sum(float a,float b){
        return a+b;
    }
    //method signature ->method name + parameter
}
