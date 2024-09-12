package ss5.circle;

public class Circle {
    private double radius = 1.0;
    String color = "red";
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius *radius;
    }


}
