class A {
    void checkAge(int age) throws IllegalAccessException, ArithmeticException { // if ArithmeticException, since it is unchecked, no throws needed.
        if(age < 16) {
            throw new IllegalAccessException("You can not drive yet.");
        } else {
            System.out.println("Age check passed!");
        }
    }
}

class B extends A {
    void checkAge(int age) throws IllegalAccessException {
        // try {
            super.checkAge(age);
        // }
        // catch(Exception e) {}
    }
}

public class Test5 {
    public static void main(String[] args) {
        B obj = new B();
        try {
            obj.checkAge(15);
        }
        catch(IllegalAccessException e) {
            // Perform some other operations
            e.printStackTrace();
        }
    }
}
