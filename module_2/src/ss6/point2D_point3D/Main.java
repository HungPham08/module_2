package ss6.point2D_point3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        p1.setX(1);
        p1.setY(4);
        p1.setZ(5);
        Point3D p2 = new Point3D();
        Point3D p3 = new Point3D();
        System.out.println(p1.toString());
        p1.setXYZ(3,5,6);
        System.out.println(Arrays.toString(p1.getXYZ()));
    }
}
