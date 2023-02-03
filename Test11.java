import java.util.LinkedList;

public class Test11 {

    public static void main(String[] args) {
        
        LinkedList myll = new LinkedList();

        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Loki");
        myll.add("Hulk");

//        System.out.println(myll.get(1));

        myll.add("Gamora");
        myll.add("Antman");
        myll.add("Natasha");




        Iterator it = myll.iterator();

        while (it.hasNext()) {
//            it.remove();
            System.out.println(it.next());
        }

        System.out.println("_______________");
        System.out.println("Whos at the top "+myll.peek());
        System.out.println("hey first one got out "+myll.poll());
        System.out.println("___________________");

it = myll.iterator();

        while (it.hasNext()) {
//          it.remove();
            System.out.println(it.next());
        }


    }
    
}
