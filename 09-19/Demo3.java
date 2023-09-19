/**
 * This file is in continuation to Demo3.java from lecture on 09/14.
 */

// this() & super()

class Computer {
    Computer() {
    
    }

    Computer(int n) {
        System.out.println("in Computer");
    }
}

class Mobile extends Computer {
    String brand;
    int price;
    static String OS;

    Mobile() {
        System.out.println("mobile default");
    }

    Mobile(String brand, int price) {
        super(2);
        // this(); // Can use only one of them
        this.brand = brand;
        this.price = price;
        // this.OS = "Android";
        System.out.println("in Constructor");
    }

    static {
        OS = "Android";
        System.out.println("in Static Block");
    }


    void show() {
        System.out.println("Brand: "+brand+" | OS: "+OS);
    }

    static void showStat(Mobile obj) {
        System.out.println("inside static method"); 
        System.out.println("Brand: "+obj.brand+" | OS: "+OS);  
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile("Samsung", 1);
        // obj1.brand = "Samsung";
        // obj1.OS = "Android";

        Mobile obj2 = new Mobile("X", 1);
        // obj2.brand = "X";
        // obj2.OS = "Android";

        // obj1.show();
        // obj2.show();

        obj2.OS = "iOS";
        // obj1.show();
        // obj2.show();

        // System.out.println(Mobile.OS);

        // obj2.showStat();
        // Mobile.showStat(obj2);

        // Math.PI;
    }
}