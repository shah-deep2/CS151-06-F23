public class NumericFns <T extends Number> {
    T num;

    NumericFns(T num) {
        this.num = num;
    }

    double square() {
        return num.intValue() * num.intValue();
    }


boolean absEqual(NumericFns<?> otherNumObj) {
    if(Math.abs(this.num.doubleValue()) == Math.abs(otherNumObj.num.doubleValue())) {
        return true;
    }
    else {
        return false;
    }
} 
    
}
