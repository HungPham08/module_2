package ss5_student_manager.service;

import ss5_student_manager.model.Student;

public class StudentService {
    private static final Student[] students = new Student[50];
    static {
        students[0] = new Student(1,"Hùng");
        students[1] = new Student(2,"Anh");
    }
    //quản lý đối tượng student
    //chỉ chứa các method CRUD : create, read, update, delete
    public Student[] getAllStudents() {
        return students;
    }
    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
}
