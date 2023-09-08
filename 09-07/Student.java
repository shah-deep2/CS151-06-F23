public class Student {
    String firstName;
    String lastName;
    int id;
    boolean graduate;
    boolean fulltime;

    void showRecords(){
        if(graduate && fulltime){
            // something
        } else if(!graduate){
            // something else
        }
    }

    public String getName() {
        return this.firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
