package problem6;

    public class Circle implements Form{
    private double parameter;
    public Circle(double pr) {this.parameter=pr;}
    public double getSurface()
    {
        double surface = this.parameter * this.parameter*3.14;
        return Math.round(surface * 100.0) / 100.0; //multiply by 100 rounnd so i will just get the nedded digits and then /100 so i will get the wanted 2 figits after the point
    }
    public String toString()
    {
        return "Circle (radius "+parameter+" cm): ";
    }
}
