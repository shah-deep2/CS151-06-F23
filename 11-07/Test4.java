class MyException extends ArithmeticException {
    MyException(String str) {
        super(str);
    }
}

public class Test4 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            // If j < 0, give error
            if(j<=0) {
                throw new MyException("j should be > 0");
            }

        }
        catch(MyException e) {
            j = 18/1;
            System.out.println("Math error: " + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong... " + e);            
        }
        

        System.out.println(j);
    }
}