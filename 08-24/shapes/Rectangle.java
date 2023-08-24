package shapes;

public class Rectangle {
    int length;
    int breath;
    
    long area(){
        return length * breath;
    }

    long perimeter(){
        return (length + breath);
    }

    public void type(){
        System.out.println("Rectangle");
    }
}
