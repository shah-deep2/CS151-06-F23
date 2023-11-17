class A {
    static int num;

    A() {
        System.out.println("in A");
    }
    
    static {
        num = 1;
        System.out.println("static " + num);
    }

    A(int n) {
        System.out.println("in A " + n);
    }

    protected void config() {
        System.out.println("config A");
    }
}

final class B extends A {
    B() {
        // super();
        // Can't use this(1) because super present
        System.out.println("in B");
    }

    B(int n) {
        System.out.println("in B " + n);
    }

    public void config() {
        System.out.println("config B");
    }

    public void onlyB() {
        System.out.println("Only in B");
    }
}


public class Test {
    public static void main(String[] args) {
        B obj1 = new B(2);

        A obj2 = new B(3);
        // Above is same as A obj3 = (A) new B(3);
        // Can't do B obj4 = new A();


        obj1.config();

        ((A) obj2).config(); 
        // ((A) a).config();  or ((B) a).config();
        
        ((B) obj2).onlyB();
    }
}
