package DesignPattern;

/* 👉 Ở đây:
 * 
 *  school chỉ tồn tại một lần duy nhất cho mọi Student.
 *   
 *  Khi changeSchool(), tất cả object đều thấy thay đổi.
*/

class Student {

    // biến static (dùng chung cho tất cả object)
    static String school = "Swinburne Vietnam"; 
    
    // biến instance (mỗi object có bản sao riêng)
    String name;

    Student(String name) { this.name = name; }



    // phương thức static -- thường cùng nhau
    static void changeSchool(String newSchool) {
        school = newSchool;
    }

    void display() {
        System.out.println(name + " hoc o " + school);
    }
}

public class TestStatic {
    public static void main(String[] args) {

        Student s1 = new Student("An");
        Student s2 = new Student("Bình");
        
        s1.display(); // An hoc o Swinburne Vietnam
        s2.display(); // Bình hoc o Swinburne Vietnam


        // đổi tên trường qua phương thức static
        Student.changeSchool("Swinburne Global");
        
        s1.display(); // An hoc o Swinburne Global
        s2.display(); // Bình hoc o Swinburne Global
    }
}
