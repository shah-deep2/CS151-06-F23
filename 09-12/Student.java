import tools.Person;

class Student extends Person {
    void show() {
        System.out.println(name);

        System.out.println(getId());
    }

    
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Deep";
        // s.id = 1;
        s.setId(1);

        s.show();
    }
}
