import java.io.File;
import java.io.IOException;

public class Test15 {

    public static void main(String[] args) {
        
        File f = new File("/Users/Chaur/Desktop/myTestFile.txt");

        try {

            f.createNewFile(); 
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("file created succesfully");
    }
    
}
