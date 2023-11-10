class A {
    int show() {
        int i=2, j=0;

        try {
            j = 20/i;
            if(j>1)
                return j;
        }
        catch(Exception e) {
            System.out.println("Error, i = " + i);
            return i;
        }
        finally {
            System.out.println("Finally j = " + j);
        }
        
        System.out.println("j = " + j);
        return j;
    }
}

public class Test0 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}