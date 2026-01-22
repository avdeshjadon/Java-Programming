// Constructor Chaining - Student Class Example
//
// Problem: Write a Java program to demonstrate constructor chaining using this().
// The program defines a Student class with three fields: studentId, studentName, and grade.
// The default constructor internally calls the parameterized constructor using this(...) to assign default values.
//
// Approach: The program creates two student objects:
//    1. Using the default constructor with constructor chaining
//    2. Using the parameterized constructor with custom values
//
// Sample Output:
// Student ID: 9
// Student Name: Dina
// Grade: O
// Student ID: 12319278
// Student Name: Avdesh Jadon
// Grade: A

package OOPS.JavaConstructor;

class Student {
    int studentId;
    String studentName;
    char grade;

    public Student() {
        this(9, "Dina", 'O');
    }

    public Student(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}

public class ConstructorChainingStudentExample {
    public static void main(String[] args) {
        Student defaultStudent = new Student();
        System.out.println("Student ID: " + defaultStudent.studentId);
        System.out.println("Student Name: " + defaultStudent.studentName);
        System.out.println("Grade: " + defaultStudent.grade);

        Student avdeshStudent = new Student(12319278, "Avdesh Jadon", 'A');
        System.out.println("Student ID: " + avdeshStudent.studentId);
        System.out.println("Student Name: " + avdeshStudent.studentName);
        System.out.println("Grade: " + avdeshStudent.grade);
    }
}