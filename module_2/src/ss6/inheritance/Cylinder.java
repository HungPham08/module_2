package ss6.inheritance;

public class Cylinder extends Circle {

    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
//    public double getArea() {
//        return 2* Math.PI*getRadius() * (height + getRadius());
//    }
    public double getSurfaceArea() {
        return 2*Math.PI*getRadius() * getHeight();
    }
    public double getVolume() {
        return 2*getArea();
    }
    public double getAreaCylinder(){
        return getSurfaceArea()+getVolume();
    }
    
}
