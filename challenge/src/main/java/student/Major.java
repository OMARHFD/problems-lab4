package student;

public class Major {
    public static Major CS = new Major("23", "Computer Science");
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;


    public Major() {
        this.students = new Student[50];
        this.studentCount = 0;
    }

    public Major(String code, String name) {
        this.id=nextId++;
        this.students = new Student[50];
        this.code = code;
        this.name = name;
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount < 50) {
            students[studentCount] = s;
            studentCount++;
        }
    }

    // Getters
    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    //Setters
    public static void setNextId(int id) {
        nextId = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] arg) {
        this.students = arg;
    }

    public void setStudentCount(int arg) {
        this.studentCount = arg;
    }

    // Display all students in the major
    public void displayStudents() {
        System.out.println("Students in " + this.name);
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    //toString overriding
    @Override
    public String toString() {
        return "Major{" +
                "MajorID='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", students='" + students + '\'' +
                ", students number='" + studentCount + '\'' +
                '}';
    }

    public Student findStudentByCNE(String cne) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCne() == cne) {
                return students[i];
            }
        }
        return null;

    }

    public boolean removeStudent(String cne) {
        Student s = findStudentByCNE(cne);
        if (s != null) {
            for (int i = 0; i < studentCount; i++) {
                if (students[i] == s) {
                    for (int j = i; j < studentCount - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[studentCount - 1] = null;
                    studentCount--;
                    return true;
                }
            }
        }

        return false;

    }
    public String getOccupancyRate()
    {
        double rate = studentCount/50.0;
        rate = rate *100;
        return String.valueOf(rate)+"%";
    }
    public String getStudentListAsString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < studentCount; i++) {
            sb.append(students[i].toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}


