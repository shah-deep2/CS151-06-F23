import tools.Calc;

/**
 * Create classes Calculator & Advanced Calculator
 * Calculator has methods add & subtract
 * Advanced Calculator has methods multiply & divide
 * AdvCal inherits Calc class
 * In main method, perform operation 2+5 using object of AdvCal
 * 
 * 
 * Create a class for Scientific Calculator say SciCal
 * Implement method to get modulus in this class
 * SciCal should have all the properties of AdvCal
 * 
 * Create an object of SciCal in main
 * Perform operation (4+5)%2 using this object 
 */

public class Test {
    public static void main(String[] args) {
        SciCal sc = new SciCal();

        double res = sc.mod( sc.add(4, 5), 2);

        System.out.println(res);

        AdvCal ac = sc;
        res = ac.add(3, 5);
        System.out.println(res);


        Calc cc = sc;
        res = cc.add(3, 5);
        System.out.println(res);

        // SciCal sc2 = new AdvCal(); 
        
    }
}
