class A {
    int n = 1;

    class B {
        void show(){
            System.out.println(n);
        }
    }

    void info() {
        B b = new B();
        b.show();
    }
}


public class Test3 {
    public static void main(String[] args) {
        A a = new A();

        A.B b = a.new B();
        b.show();        
        // a.info();
    }
}
