package problem5.instructor;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName=secondName;
        this.phone=telephone;
        this.email=email;
    }
    public Person()
    {}
    //Getters
    public static int getNextId(){return  nextId;}
    public String getFirstName() { return this.firstName;};
    public String getSecondName() { return this.secondName;};
    public String getPhone() { return this.phone;};
    public String getEmail() { return this.email;};

    //Setters
    public static void setNextId(int id) {nextId = id;}
    public void setId(int id) {this.id=id;}
    public void setFirstName(String name1) {this.firstName=name1;}
    public void setSecondName(String name2) {this.secondName=name2;}
    public void setPhone(String arg) {this.phone=arg;}
    public void setEmail(String arg) {this.email=arg;}

    //toString overriding
    @Override
    public String toString() {
        return "Person{" +
                "Person id='" + id + '\'' +
                ", name='" + firstName + " " + secondName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\''+
                '}';
    }


}

