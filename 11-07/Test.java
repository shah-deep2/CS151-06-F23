public class Test {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        try {
            j = 18/i;
        }
        catch(Exception e) {
            System.out.println("Something went wrong...");            
        }

        System.out.println(j);
    }
}