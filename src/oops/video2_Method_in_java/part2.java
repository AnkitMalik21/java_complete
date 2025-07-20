package oops.video2_Method_in_java;

public class part2 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(multiplyBy10(x));//ans -> 100
        //when we pass parameter reference is copied
        // input x is just a copy of varible x ,it does not change real value of x
        System.out.println(x);//ans -> 10

//      object ref = value
        String a ="Ankit";
        System.out.println(upper(a));
    }
    public static int multiplyBy10(int x){
        return x*10;
    }

    public static String upper(String str){
        return str.toUpperCase();
    }
}
