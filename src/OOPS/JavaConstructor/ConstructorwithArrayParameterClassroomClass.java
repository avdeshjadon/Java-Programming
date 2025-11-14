// ------------------- 🔹 Constructor with Array Parameter - Classroom Class 🔹 -------------------
//
// 💡 Write a Java program to demonstrate using **array parameters in a constructor**.
// The `Classroom` class includes:
//   - A `className` field
//   - A `students` array to store student names
//
// 🧠 The constructor takes both values and stores them.
// A method `display()` prints the classroom name and all student names in one line.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// ClassRoom : Alpha Class
// Students : Avdesh Aman Suman

package OOPS;

class Classroom {
    private String className;
    private String[] students;

    public Classroom(String className, String[] students) {
        this.className = className;
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    public String[] getStudents() {
        return students;
    }

    public void display() {
        System.out.println("ClassRoom : " + className);
        System.out.print("Students : ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
    }
}

public class ConstructorwithArrayParameterClassroomClass {

    public static void main(String[] args) {
        String[] studentArray = {"Avdesh", "Aman", "Suman"};
        Classroom classRoom = new Classroom("Alpha Class", studentArray);
        classRoom.display();
    }
}
