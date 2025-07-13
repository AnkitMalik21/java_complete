package Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//try with resource
public class part7 {
    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {

            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}
