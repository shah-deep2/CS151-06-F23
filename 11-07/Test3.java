public class Test3 {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            // If j < 0, give error
            if(j<=0) {
                throw new ArithmeticException("j should be > 0");
            }

        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("Math error: " + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong... " + e);            
        }
        

        System.out.println(j);
    }
}