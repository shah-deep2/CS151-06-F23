class A {
    private int n = 1;

    class B {
        void show(){
            System.out.println(n);
        }
    }

    void info() {
        B b = new B();
        b.show();
    }

    static void info2() {
        A a = new A();
        A.B b = a.new B();
        b.show();        
        // a.info();
    }

    static class C {

    }
}


public class Test1 {
    public static void main(String[] args) {
        A.info2();

        A.C c = new A.C();

    }
}
