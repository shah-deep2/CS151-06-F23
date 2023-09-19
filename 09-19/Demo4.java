class A {
    void show1() {
        System.out.println("in show A");
    }
}

class B extends A {
    void show2() {
        System.out.println("in show B");
    }
}

public class Demo4 {
    public static void main(String[] args) {
        // double d = 4.5;
        // int i = (int) d;
        double j = (double) 2;

        A obj = new A();
        obj.show1();
        // obj.show2();

        A obj2 = (A) new B();
        // obj.show2();

        B obj3;
        obj3 = (B) obj2;
        obj3.show2();


    }
}
