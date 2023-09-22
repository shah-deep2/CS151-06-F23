interface Computer {

}

interface Laptop extends Computer {

}


interface W {

}

interface X {
    void show();
}

interface Y {
    void show();
    void config();
}

interface Z extends X, Y {

}

abstract class B {

}

class A extends B implements W, Z {
    public void show() {

    }

    public void config() {

    }
}

public class Demo3 {
    public static void main(String[] args) {
        X obj = (X) new A(); // Reference type can be B, W, Z, X, Y
        obj.show(); // Can only use the properties of X
    }
}
