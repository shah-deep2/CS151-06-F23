package Singleton;
public class Singleton {

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton() { }
    

    public static Singleton getInstance() {
        return instance;
    }
    
}
