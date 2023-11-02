interface A {
    void show();

    default void info() {

    }
}

// class B implements A {
//     void show() {
//         System.out.println("Override");
//     }
// }

public class Test3b {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Override");
            }
        };

        obj.show();
    }
}