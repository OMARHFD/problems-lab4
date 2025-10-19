package Problem7;

public class Plumber implements Person {
    private String name;
    public Plumber(String n) { this.name=n;}
    public void display ()
    {
        System.out.println("I am " + name + " the Plumber ");
    }
}
