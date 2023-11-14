class A extends Thread {
    public void show() {
        for(int i=0; i<100; i++) {
            System.out.println("Hi " + i);

            if(i==50) {
                Thread.yield(); 
            }
        }
    }

    public void run() {
        show();
    } 
}

class B extends Thread {
    public void show() {
        for(int i=0; i<100; i++) {
            System.out.println("Hello " + i);

            if(i==50) {
                Thread.yield(); 
            }
        }
    }

    public void run() {
        show();
    } 
}

public class Test1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}