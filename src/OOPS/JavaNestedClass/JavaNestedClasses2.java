// ------------------- 🔹 Static Nested Class 🔹 -------------------
//
// 💡 Write a Java program to demonstrate a **static nested class**.
// Create a class `University` with a static nested class `Department` that has a static method:
//     - `displayInfo(String name, int num)` to print department name and number of faculty.
//
// In the `main` method, take user input for department name and number of faculty,
// and use the static nested class method to display the information.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Enter the department name : Computer Science
// Enter the number of faculty : 15
// Department Name : Computer Science
// Number of faculty members : 15

package OOPS.JavaNestedClass;

import java.util.Scanner;

class University {
    public static class Department {
        public static void displayInfo(String name, int num) {
            System.out.println("Department Name : " + name);
            System.out.println("Number of faculty members : " + num);
        }
    }
}

public class JavaNestedClasses2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the department name : ");
        String departmentName = sc.nextLine();
        System.out.print("Enter the number of faculty : ");
        int noOfFaculty = sc.nextInt();
        University.Department.displayInfo(departmentName, noOfFaculty);
        sc.close();
    }
}
