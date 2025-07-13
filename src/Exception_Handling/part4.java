package Exception_Handling;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// this is a checked exception
//they are checked at compile time

//throws make caller aware about a potential exception being thrown
public class part4 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader("a.txt");
        }catch (Exception e){
            System.out.println("FILE not found");
            throw new FileNotFoundException("oops");
        }

    }
}
