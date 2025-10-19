package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom , nom , telephone,email);
        this.cne=cne;
        setMajor(major);
    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(prenom,nom , telephone,email);
        this.cne=cne;
        this.major=Major.CS;
        this.major.addStudent(this);
    }
    public Student()
    {}

    // Getters
    public String getCne(){return this.cne;}
    public Major getMajor(){return this.major;}

    // Setters
    public void setCne(String arg){this.cne=arg;}
    public void setMajor(Major arg){this.major=arg;}

    //toString overriding
    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + id + '\'' +
                ", name='" + firstName + " " + secondName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\''+
                ", cne='" + cne + '\''+
                ", major='" + major + '\''+
                '}';
    }

    public String getFullNameFormatted()
    {
        return String.format("%S", this.secondName) + "," +firstName;
    }
}

