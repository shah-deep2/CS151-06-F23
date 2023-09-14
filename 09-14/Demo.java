// in show A
// in show B

class A {

    int n = 1;

    protected void show() {
        System.out.println("in show A");
    }

    void show(int n) {
        System.out.println("in show A Int");
    }

    void show(double n) {
        System.out.println("in show A Int");
    }

    void config() {
        System.out.println("in config A");
    }
}

class B extends A {

    int n = 2;

    // void show2() {
    //     System.out.println("in show B");
    // }

    public void show() {
        // super.config();
        super.show();
        System.out.println("in show B");
    }

    void info() {
        super.show();
        this.show();
        System.out.println(n);
        System.out.println(super.n);

    }
}

public class Demo {
    public static void main(String args[]) {
        B obj = new B();

        obj.show();

        // obj.show(5.0);

        // obj.info();
    }
}