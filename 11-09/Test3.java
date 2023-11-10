// class A implements Runnable {
//     public void run() {
//         for(int i=0; i<100; i++) {
//             System.out.println("Hi");
//         }
//     }
// }

class B implements Runnable {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Hello");
        }
    }
}


public class Test3 {
    public static void main(String[] args) {
        Runnable a = 
            () -> {
                for(int i=0; i<100; i++) 
                    System.out.println("Hi");  
            };

        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);


        t1.start();
        t2.start();
    }
}
