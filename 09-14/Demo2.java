class Calc {
    // final int model;

    // Calc(int model) {
    //     this.model = model;
    // }

    final void show() {
        System.out.println("Made by Deep");
    }

    int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCal extends Calc {
    void show2() {
        System.out.println("Made by XYZ");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        final int n = 4;
        // n = 2;


        // Calc c = new Calc(1);

        // System.out.println(c.model);

        AdvCal ac = new AdvCal();
        ac.show();
    }
}
