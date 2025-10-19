package Problem7;


public class Carpenter implements Person {
    private String name;
    public Carpenter(String n) { this.name=n;}
    public void display()
    {
        System.out.println("I am "+name+" the Carpenter ");
    }
}
