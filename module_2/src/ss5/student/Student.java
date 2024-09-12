package ss5.student;

public class Student {
    private String name ="Hùng";
    private String classes = "C06";
    public Student() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String displayInformation(){
        return "Name :"+this.name+"\nClasses :"+this.classes;
    }
}
