import java.util.HashMap;

public class MyStuff <T, V> {
    // variable T which is the "Type"
    T n;
    V m;

    HashMap<T, V> map = new HashMap<>();

    MyStuff(T n, V m) {
        this.n = n;
        this. m = m;
    }

    void show() {
        System.out.println(this.n);
    }

    void showType() {
        System.out.println("n: " + n.getClass().getName());
        System.out.println("m: " + m.getClass().getName());
    }
}
