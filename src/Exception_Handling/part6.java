package Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//finally in this case is used to close the system resource

public class part6 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }finally {
             try{
                 if(reader != null){
                     reader.close();
                 }
             }catch (IOException e){
                 System.out.println("Error closing reader: " + e.getMessage());
             }
        }
    }
}
