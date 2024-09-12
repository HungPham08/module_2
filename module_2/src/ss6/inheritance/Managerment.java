package ss6.inheritance;

public class Managerment {
    //Lớp con có thể kể thừa các thuộc tính, hành vi ko phải private của lớp cha
    //Trong java chỉ cho phếp đơn ke thừa
    //Lớp con không thể ké thừa constructor của lớp cha
    //
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Hùng");
        System.out.println(child.name);
    }
}
