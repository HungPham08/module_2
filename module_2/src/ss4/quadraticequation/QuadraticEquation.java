package ss4.quadraticequation;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public QuadraticEquation() {

    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public void display() {
        System.out.format("Phương trình bậc 2: %.1fx2 + %.1fx + %.1f \n",a,b,c);
    }
    public double getDiscriminant(){
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant()))/(2*a);
    }
}

