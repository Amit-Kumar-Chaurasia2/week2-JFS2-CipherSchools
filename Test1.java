
public class Test1 {

    // this keyword

    int arg =5;

    void myTest(int arg) {
        arg=arg;
    }

    public static void main(String[] args) {
        int arg=10;
        Test1 obj = new Test1();
        obj.myTest(arg);
        System.out.println(obj.arg);
    }
}