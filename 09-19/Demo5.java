abstract class Shape {
    String color;

    abstract void draw();

    void setColor(String color) {
        this.color = color;
    }
}

abstract class Rectangle extends Shape {
    // void draw() {
    //     // ... Rectangle
    // }
}

class Cuboid extends Rectangle {
    void draw() {

    }
}

class Circle extends Shape {
    void draw() {
        // ... Circle
    }
}

public class Demo5 {
    public static void main(String[] args) {
        // Rectangle r = new Rectangle();
        // r.draw();


        // Shape s = new Rectangle();
        // s.draw();
        // s.setColor("Blue");
    }
}
