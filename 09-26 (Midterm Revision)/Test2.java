interface W {

}

interface X {

}

interface Y {
    
}

interface Z extends X, Y {

}

abstract class A {
    /**
     * Prints input parameter n.
     * @param n Input any integer.
     */
    void show(int n) {
        System.out.println("Showing "+n);
    }

    void show(double n) {
        System.out.println(this.getClass()+" "+n);
    }
}

class B extends A implements W, Z {

}

public class Test2 {
    public static void main(String[] args) {
        A b = new B();

        b.show(1);
        b.show(1.0);
    }
}
