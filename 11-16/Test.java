public class Test {
    public static void main(String[] args) {
        // MyStuffInt obj = new MyStuffInt(2);
        // obj.show();

        // MyStuff<Integer> obj2 = new MyStuff<>(2);
        // obj2.show();


        // MyStuff<Integer, Double> obj3 = new MyStuff<>(4, 2.4);
        // // obj3.show();
        // obj3.showType();


        NumericFns<Integer> obj4 = new NumericFns<>(8);

        // System.out.println(obj4.square());

        NumericFns<Double> obj5 = new NumericFns<>(-8.0);

        boolean res = obj4.absEqual(obj5);
        System.out.println(res);
    }
}
