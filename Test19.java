import java.io.BufferedReader;
import java.io.FileReader;

public class Test19 {

    public static void main(String[] args) {
        
        FileReader fr= new FileReader("/Users/Chaur/Desktop/rhyme.txt");

        BufferedReader br = new BufferedReader(fr);

        /* 
        
        String line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);

        */

        while((line = br.readLine())!=null) {
            System.out.println(line);
        }

        br.close();
        fr.close();

        /*
         * ArrayList<String> pokemons = new ArrayList<String>();
         * 
         * br.readLine();
         * 
         * while((line = br.readLine())! = null) {
         * pokemons.add(line);
         * }
         * System.out.println("Total Pokemons "+ pokemons.size());
         * 
         * 
         * 
         */

        

    }
    
}
