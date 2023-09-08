// Create a class Triangle
// It has attributes height & baseLength
// calculate its area without taking any parameters
// intialize height & baseLength through a Constructor

// make height & baseLength private
// Create getters & setters to access & update their values     --> Encapsulation
// create another method "area" that takes in height & baseLength as parameters

// 3rd area method that takes parametes as "side1", "side2", "angle"
// Calculate its area with the formula 1/2 * s1 * s2 * Sin(angle)
// 0.5 * side1 * side2 * Math.sin( Math.toRadians(angle) );

// A default constructor that calls out parameterised constructor to 
//      set some default values  ( this() method )

public class Triangle {
    private int height;
    private int baseLength;

    Triangle() {
        this(3, 4);
    }

    Triangle(int height, int baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    int getHeight(){
        return this.height;
    }

    int getBaseLength(){
        return this.baseLength;
    }

    void setHeight(int height){
        this.height = height;
    }

    void setBaseLength(int baseLength){
        this.baseLength = baseLength;
    }

    
    double area(){
        return 0.5 * height * baseLength;
    }
  
    double area(int height, int baseLength){
        return 0.5 * height * baseLength;
    }

    double area(int side1, int side2, int angle){
        return 0.5 * side1 * side2 * Math.sin( Math.toRadians(angle) );
    }


    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println(t.area());

        System.out.println(t.area(3, 4, 90));
    }
}
