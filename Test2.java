class App{

    App(){
        System.out.println("Constructor of App");
    }
}

public class Test2 extends App {

    Test2(){
        super();
        System.out.println("Constructor of Test2");
    }

    public static void main(String[] args) {
        
        new Test2();
    }
    
}
