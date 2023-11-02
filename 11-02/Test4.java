interface A {
    void show();

    // default ...
}

@FunctionalInterface
interface B {
    int add(int n1);
    // int add(int n1, int n2);
    // int sub(int n1, int n2);
}

public class Test4 {
    public static void main(String[] args) {

        B obj2 = n1 -> n1 + 2;

        System.out.println(obj2.add(2));

        A obj = () -> {
                System.out.println("Show");
            };

        // obj.show();
    }
}