package ss4.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.SLOW,true,10,"yellow");
        Fan fan2 = new Fan(Fan.MEDIUM,true,5,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
