package ss5.circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        System.out.println("Nhập bán kính");
        double radius = new Scanner(System.in).nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Diện tích :" + circle.getArea());

    }
}
