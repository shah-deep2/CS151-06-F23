class A extends Thread {
    public void show() {
        for(int i=0; i<100; i++) {
            System.out.println("Hi");
            try { Thread.sleep(20); } catch(InterruptedException e) {} 
        }
    }

    public void run() {
        show();
    }

}

class B extends Thread {
    public void show() {
        for(int i=0; i<100; i++) {
            System.out.println("Hello");
            try { Thread.sleep(20); } catch(InterruptedException e) {}
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

        // a.setPriority(Thread.MIN_PRIORITY);
        // System.out.println(a.getPriority());

        a.start();
        b.start();
    }
}
