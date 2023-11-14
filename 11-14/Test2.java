import java.util.concurrent.locks.ReentrantLock;

class Counter {
    int count = 0;

    /*
    public synchronized void increment() {
        count++;
        // int tmp = count;
        // tmp += 1;
        // count = tmp;

        // Gets the value of count;
        // Increases the value of count
        // Updates the attribute count
    }

    // Object lock = new Object();

    public void increment() {
        // some other parallel functionalities
        synchronized(this) {
            count++;
        } 
    }

    */

    ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            // lock.unlock();
            release();
        }
    }

    void release() {
        lock.unlock();
    }
}

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // Runnable a = new Runnable() {
        //     public void run() {
        //         for(int i=0; i<10000; i++)
        //             c.increment();
        //     }
        // };

        Runnable b = 
            () -> {
                for(int i=0; i<10000; i++)
                    c.increment();
            }
        ;

        Thread t1 = new Thread(() -> {
                for(int i=0; i<10000; i++)
                    c.increment();
            });
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        // Thread.sleep(1000);

        System.out.println(c.count);
    }
}
