class A {
    void show() {
        System.out.println("in show A");
    }
}

class B extends A {
    void show() {
        System.out.println("in show B");
    }
}

class C extends A {
    void show() {
        System.out.println("in show C");
    }
}

class D extends C {
    void show() {
        System.out.println("in show D");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        obj = new D();
        obj.show();
    }
}
