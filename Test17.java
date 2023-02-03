import java.io.FileWriter;

public class Test17 {
    public static void main(String[] args) {
        
        FileWriter fw = new FileWriter("/Users/Chaur/Desktop/TestFile.txt");

        fw.write("I am The Earth \n");
        fw.write("I am The Forest Green \n");
        fw.write("I am the Four WInds Blowing \n");
        fw.write("I am the Earth \n");
        
        fw.write("Thanos is Inevitable");
        
        fw.flush();

        fw.close();

        System.out.println("File Prepared Succesfully!");

    }
    
}
