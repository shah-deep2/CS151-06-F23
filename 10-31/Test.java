interface A {
    default int add(int n1, int n2) {
        return n1 + n2;
    }

    static int mul(int n1, int n2) {
        System.out.println("In A");
        return n1 * n2;
    }

    // static default int sub(int n1, int n2) {
    //     return n1 - n2;
    // }

    default int div(int n1, int n2) {
        return n1 / n2;
    }
}

class B implements A {
    public int div(int n1, int n2) {
        if(n2==0) {
            return 0;
        }
        return n1 / n2;
    }

    static int mul(int n1, int n2) {
        System.out.println("In B");
        int tmp=0;
        for(int i=0; i<n2; i++){
            tmp+=n1;
        }
        return tmp;
    }
}


public class Test {
    public static void main(String[] args) {
        B b = new B();
        // System.out.println(b.add(1, 2));

        // System.out.println(b.div(1, 0));


        System.out.println(A.mul(2, 5));
        System.out.println(b.mul(2, 4));
    }
}
