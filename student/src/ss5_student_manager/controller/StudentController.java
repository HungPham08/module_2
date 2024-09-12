package ss5_student_manager.controller;

import ss5_student_manager.model.Student;
import ss5_student_manager.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private static StudentService studentService = new StudentService();
    public static void main(String[] args) {
        showStudentMenu();
    }
    public static void showStudentMenu() {
        while(true){
            System.out.println("Chọn chức năng\n" +
                    "1. Hiển thị danh sách\n" +
                    "2. Thêm mới\n" +
                    "3. Xóa\n" +
                    "4. Thoát");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch(choose){
                case 1:
                    //Hiển thị
                    Student[] students = studentService.getAllStudents();
                    for (int i = 0; i < students.length; i++) {
                        if (students[i] != null) {
                            System.out.println(students[i]);
                        }else {
                            break;
                        }
                    }
                    break;
                case 2:
                    //THêm mới
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    Student student = new Student(id, name);
                    studentService.addStudent(student);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
