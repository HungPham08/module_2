package ss5.student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("Văn");
        s2.setName("Quốc");
        System.out.println(s1.displayInformation());
        System.out.println(s2.displayInformation());
    }
}
