public class Test6 {

    int getNextNo(int n) {
        try{
        if (n==5) {
            return n;
        }

        }
        finally {
        System.out.println("This is important CODE");
        }

        return n-1;
    }

    public static void main(String[] args) {
        
        Test6 obj= new Test6();
        System.out.println(obj.getNextNo(5));
    }
    
}
