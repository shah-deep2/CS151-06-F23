abstract class A {
    abstract void show();

    void info() {

    }

    // other methods or attributes
}

// class B extends A {
//     void show() {
//         System.out.println("Override");
//     }
// }

public class Test3 {
    public static void main(String[] args) {
        A obj = new A() {
            void show() {
                System.out.println("Override");
            }
        };

        obj.show();
    }
}