class Mobile {
    String brand;
    int price;
    static String OS;

    Mobile() {

    }

    Mobile(String brand, int price) {
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
