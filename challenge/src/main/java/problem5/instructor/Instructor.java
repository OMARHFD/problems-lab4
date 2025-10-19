package problem5.instructor;


public class Instructor extends Person
{
    private String EmployeeNumber;
    private Subject subject;

    public Instructor()
    {}

    public Instructor(String nom, String prenom, String telephone, String email, String Eno) {
        super(prenom , nom , telephone,email);
        this.EmployeeNumber=Eno;
    }
    public String getEmployeeNumber() { return EmployeeNumber; }
    public void setEmployeeNumber(String employeeNumber) { this.EmployeeNumber = employeeNumber; }
    public String cleanEmployeeNumber() {
        if (EmployeeNumber == null) return "";
        return EmployeeNumber.trim().replaceAll("\\s+", "");
    }

    public String summaryLine() {
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]",
                EmployeeNumber, secondName, firstName);
    }


    public String toCard() {
        StringBuilder sb = new StringBuilder();

        sb.append("Instructor\n");
        sb.append("----------\n");
        sb.append("Employee #: <").append(cleanEmployeeNumber()).append(">\n");
        sb.append("Name      : <").append(secondName).append(">, <").append(firstName).append(">\n");
        sb.append("Email     : <").append(email).append(">\n");
        sb.append("Phone     : <").append(phone).append(">");

        return sb.toString();
    }


    public String displayName() {
        StringBuilder sb = new StringBuilder();

        if (firstName != null && secondName != null) {
            sb.append(firstName).append(" ").append(secondName);
        } else if (secondName != null) {
            sb.append(secondName);
        } else if (firstName != null) {
            sb.append(firstName);
        } else {
            sb.append("Unknown");
        }

        return sb.toString();
    }

}
