import java.util.ArrayList;
import java.util.regex.Pattern;
import java.lang.String;
import java.lang.System;
import java.lang.*;

import packageA.ClassA;
import packageA.packageB.ClassB;
import packageA.packageB.packageC.*;;


public class Test {
    public static void main(String[] args) {
    //    ArrayList l = new ArrayList();

    //    Pattern p = Pattern.compile("a*b");


    //    String str = "abc";

    //    System.out.println(str);

    ClassA a = new ClassA();
    // ClassB b = new ClassB();

    // new ClassC().show();

    // Test2 t2 = new Test2();
    // t2.show();


    // a.show();

    Car c = new Car();
    c.setName("C1");

    // System.out.println(c.name);

    System.out.println(c.getClass().getName());
    System.out.println(c.getClass().getPackage());


    }
}
