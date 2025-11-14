// ------------------- 🔹 Constructor Chaining - Student Class 🔹 -------------------
//
// 💡 Write a Java program to demonstrate **constructor chaining** using `this()`.
// The program defines a `Student` class with three fields: `studentId`, `studentName`, and `grade`.
// The default constructor internally calls the parameterized constructor using `this(...)` to assign default values.
//
// 🧠 The program creates two student objects:
//    1. Using the default constructor with constructor chaining
//    2. Using the parameterized constructor with custom values
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Student ID : 9
// Student Name : Priya
// Grade : O
// Student ID : 12319278
// Student Name : Avdesh Jadon
// Grade : A


package JavaConstructor;

class Student {
    int studentId;
    String studentName;
    char grade;

    public Student() {
        this(9, "Priya", 'O');
    }

    public Student(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}

public class ConstructorChainingStudentClass {


    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student ID : " + student1.studentId);
        System.out.println("Student Name : " + student1.studentName);
        System.out.println("Grade : " + student1.grade);

        Student student2 = new Student(12319278, "Avdesh Jadon", 'A');
        System.out.println("Student ID : " + student2.studentId);
        System.out.println("Student Name : " + student2.studentName);
        System.out.println("Grade : " + student2.grade);
    }
}
