
public class Person{
    String name;
    int id;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Person p = new Person();
        // p.setName("Deep");

        // System.out.println(p.getName());
        //p.showRecords();


        Faculty f = new Faculty();
        // f.setName("Deep");

        // System.out.println(f.getName()); 
        
        f.showRecords();
        
        
        Student s = new Student();
        
        
        
        Person p2 = new Student();
        Person p3 = new Faculty();
        
        // p3.showRecords(); 
        
        
        Person[] pArr = new Person[3];
        pArr[0] = new Student();
        pArr[1] = new Faculty();
        pArr[2] = new Person();
        
    }

}
