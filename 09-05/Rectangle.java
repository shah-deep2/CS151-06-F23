public class Rectangle {

    // public Rectangle() {

    // }

    private int length;
    private int breath;

    Rectangle() {
        // this.length = 5;
        // this.breath = 10;
        this(5);
    }

    Rectangle(int length) {
        // this.length = length *10;
        // this.breath = 10 *10;

        this(length, 10);
    }

    // Rectangle(long breath) {
    //     this.breath = (int) breath;
    // }

    Rectangle(int length, int breath) {
        this.length = length *100;
        this.breath = breath *100;
    }


    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return this.breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }


    long area(){
        return length * breath;
    }

    
}
