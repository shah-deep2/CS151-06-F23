// interface AnimalInt {
//     void printVoice();
// }

// abstract class --> interface
interface Animal {
    // public static final boolean canSound = true;
    boolean canSound = true;
    void printVoice();
}

abstract interface Mammal {
    public abstract void walk();
    void printVoice();
}

class Dog implements Animal, Mammal {
    private String voice;

    public void printVoice(){
        System.out.println(voice);
    }

    public void walk() {

    }

    protected void show() {

    }
}



public class Demo2 {
    
}
