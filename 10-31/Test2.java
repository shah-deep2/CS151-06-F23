class NormalClass {
    void normalMethod() {
        System.out.println("Normal Parent");
    }
}

abstract class A extends NormalClass {
    abstract void info();

    void show() {
        normalMethod();
        info();
    }
}

class B extends A {
    void info() {
        System.out.println("B info");
    }
}

public class Test2 {
    public static void main(String[] args) {
        B obj = new B(); 
        obj.show();
    }
}
