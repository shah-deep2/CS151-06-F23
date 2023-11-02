class A {
    void show() {
        // ....
    }

    void info() {

    }

    // other methods or attributes
}

class B extends A {
    @Override
    void show() {
        System.out.println("Override");
    }
}

public class Test2 {
    public static void main(String[] args) {
        A obj = new A() {

            // A() {  // Not Valid

            // }

            static final int n = 1;

            void show() {
                System.out.println("Override");
            }

            void info() {

            }

            void info2() { } // Can Not define new methods. It will error when calling obj.info2()

        };

        obj.info();
    }
}