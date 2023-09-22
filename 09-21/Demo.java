class Calc {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int mult(int n1, int n2) {
        int res=0;
        for(int i=0; i<n2; i++){
            res += n1;
        }
        return res;
    }
}

class AdvCalc2 {
    int mult(int n1, int n2) {
        return n1 * n2;
    }
}

class SciCal extends Calc, AdvCalc2 
{

}


public class Demo {
    public static void main(String[] args) {
        
    }
}
