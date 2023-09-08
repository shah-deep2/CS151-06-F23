class Person {
    String name;
    int id;
    boolean student;
    boolean graduate;
    boolean fulltime;

    Person(boolean s) {
        this.student = s;
    }

    void showRecords(){
        if(student){
            if(graduate && fulltime){
                // something
            } else if(!graduate){
                // something else
            }

            // student records
        } else {
            // some faculty details
        }
    }

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

}
