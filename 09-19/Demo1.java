class Person {
    String name;
    int id;

    void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    void setName(String name) {
        this.name = name;
        System.out.println("name");
    }

    int getStudentId(){
        return id;
    }
}

class Faculty extends Person {

}

public class Demo1 {
    public static void main(String[] args) {
        // Person[] p = new Person[3];
        
        // p[0] = new Person();
        // // p[0].setName("Deep");
        // p[1] = new Student();
        // p[1].setName("Deep");
        // p[2] = new Faculty();


        Person p1 = new Student();
        // Student s1 = (Student) p1;
        // s1.getStudentId();

        ((Student) p1).getStudentId();

        Person p2 = new Person();

        if(p1 instanceof Student) {
            ((Student) p1).getStudentId();
        } else {
            System.out.println("Not a student");
        }

        

    }
}
