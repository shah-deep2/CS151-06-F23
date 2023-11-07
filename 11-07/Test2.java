public class Test2 {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;

        int nums[] = new int[5];

        try {
            j = 18/i;

            System.out.println(nums[0]);
            // System.out.println(nums[5]);

            nums = null;
            System.out.println(nums.length);

        }
        catch(ArithmeticException e) {
            j = 18/1;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in bounds");
        }
        catch(Exception e) {
            System.out.println("Something went wrong... " + e);            
        }
        

        System.out.println(j);
    }
}