package student;

public class Test {
    public static void main(String[] args) {
        Major SHBM = new Major("154", "SHBM");
        Student s1 = new Student("amal", "safi", "0675141698", "amal@gmail.com", "22885676");
        Student s2 = new Student("samir", "alami", "074151695", "alami@gmail.com", "23585976");
        Student s3 = new Student("ali", "benali", "074151655", "ala45@gmail.com", "235554976", SHBM);

        // Test getFullNameFormatted()
        System.out.println("Formatted name: " + s1.getFullNameFormatted());

        // Test findStudentByCNE()
        Student found = Major.CS.findStudentByCNE("22885676");
        System.out.println("Found student: " + (found != null ? found.getFullNameFormatted() : "Not found"));

        // Test getStudentCount()
        System.out.println("CS students count: " + Major.CS.getStudentCount());

        // Test getOccupancyRate()
        Major.CS.getOccupancyRate();

        // Test getStudentListAsString()
        System.out.println(Major.CS.getStudentListAsString());

        // Test removeStudent()
        boolean removed = Major.CS.removeStudent("22885676");
        System.out.println("Student removed: " + removed);
        Major.CS.displayStudents();
    }
}