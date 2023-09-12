/**
 * Print:
 * in B
 * in A  INT
 *
 */

class A extends Object {
    A() {
        super();
        System.out.println("in A");
    }

    A(int n) {
        super();
        System.out.println("in A  INT");
    }
}

class B extends A {
    B() {
        super(5);
        System.out.println("in B");
        // super(5);
    }

    B(int n) {
        super(n);
        System.out.println("in B  INT");
    }
}

public class Demo {
    public static void main(String[] args) {
        Object obj = new B();
    }    
}
