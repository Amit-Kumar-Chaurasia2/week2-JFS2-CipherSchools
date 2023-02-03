import java.io.File;

public class Test16 {

    public static void main(String[] args) {
        
        File f = new File("/Users/Chaur/Desktop/TestFile.txt");

        if (f.exists()) {

            System.out.println("Printing File Details");
            System.out.println("---------------------");

            System.out.println("File Name : "+f.getName());
            System.out.println("File Size : "+f.length());
            System.out.println("File Path : "+f.getAbsolutePath());
            System.out.println("is File Readable ? "+f.canRead());
            System.out.println("is File Writable ? "+f.canWrite());

            System.out.println("----------------------");

        }
        //Creating Directory In Java

        File f1 = new File("/Users/Chaur/Desktop/avengers");
        f1.mkdir();
    }
}
