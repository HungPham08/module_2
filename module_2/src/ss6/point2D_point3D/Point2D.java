package ss6.point2D_point3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {}
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }
    public float[] getXY() {
        return new float[] {getX(), getY()};
    }

    @Override
    public String toString() {
        return "("+getX() + "," + getY()+")";
    }
}
