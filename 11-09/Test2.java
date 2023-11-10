class A implements Runnable {
    public void show() {
        for(int i=0; i<100; i++) {
            System.out.println("Hi");
            // try { Thread.sleep(20); } catch(InterruptedException e) {} 
        }
    }

    public void run() {
        show();
    }

}

class B implements Runnable {
    public void show() {
        for(int i=0; i<100; i++) {
            System.out.println("Hello");
            // try { Thread.sleep(20); } catch(InterruptedException e) {}
        }
    }

    public void run() {
        show();
    }
}


public class Test2 {
    public static void main(String[] args) {
        Runnable a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);


        t1.start();
        t2.start();
    }
}
