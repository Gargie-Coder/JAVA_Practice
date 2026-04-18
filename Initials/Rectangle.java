package Initials;
public class Rectangle {
     double length;  // public by default
    private double width;//even though it is private but is accessible by all the class members and the main method(present in the same class) as well and that is why we are not required to set it directly using getter and setter.

    public double area() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 4;
        rec.width = 6;
        System.out.println("Area = " + rec.area());
    }
}
