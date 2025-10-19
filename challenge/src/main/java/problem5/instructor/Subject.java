package problem5.instructor;

public class Subject {
    public static int sId = 0;
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    public Subject()
    {}

    public Subject(String code , String title)
    {
        this.id=sId++;
        this.code=code;
        this.title=title;
    }
    public Subject(String code , String title,Instructor ins)
    {
        this.id=sId++;
        this.code=code;
        this.title=title;
        this.instructor=ins;
    }


    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public Instructor getInstructor() { return instructor; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }




    public String normalizedCode() {
        if (code == null) return "";
        return code.trim().toUpperCase();
    }


    public String properTitle() {
        if (title == null || title.isEmpty()) {
            return "";
        }

        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                // Capitaliser la première lettre
                sb.append(words[i].substring(0, 1).toUpperCase());
                // Ajouter le reste en minuscule
                if (words[i].length() > 1) {
                    sb.append(words[i].substring(1).toLowerCase());
                }
                // Ajouter un espace sauf pour le dernier mot
                if (i < words.length - 1) {
                    sb.append(" ");
                }
            }
        }

        return sb.toString();
    }



    public boolean isIntroCourse() {
        boolean titleContainsIntro = (title != null) && title.toLowerCase().contains("intro");

        boolean codeStartsWithIntro = (code != null) && code.toUpperCase().startsWith("INTRO-");

        return titleContainsIntro || codeStartsWithIntro;
    }


    public String syllabusLine() {
        StringBuilder sb = new StringBuilder();

        sb.append("<").append(code).append("> - <").append(title).append(">");

        if (instructor != null) {
            sb.append(" (Instructor: <")
                    .append(instructor.getSecondName())
                    .append("> <")
                    .append(instructor.getFirstName())
                    .append(">)");
        }

        return sb.toString();
    }


}
