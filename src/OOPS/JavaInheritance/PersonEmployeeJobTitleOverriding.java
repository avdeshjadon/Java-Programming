// Person Employee Job Title Overriding
//
// Problem: Write a Java program to create a class called Person with methods:
//     - getFirstName()
//     - getLastName()
//
// Then create a subclass called Employee1 that:
//   Overrides the getLastName() method to include the job title
//   Adds a new method called getEmployeeId()
//
// Sample Output:
// First Name: Avdesh
// Last Name: Ghatoye - Software Engineer
// Employee ID: E12345

package OOPS.JavaInheritance;

class Person {
    private String firstName;
    private String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee1 extends Person {
    private String employeeId;
    private String jobTitle;

    Employee1(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    String getEmployeeId() {
        return employeeId;
    }

    @Override
    String getLastName() {
        return super.getLastName() + " - " + jobTitle;
    }
}

public class PersonEmployeeJobTitleOverriding {
    public static void main(String[] args) {
        Employee1 avdeshEmployee = new Employee1("Avdesh", "Ghatoye", "E12345", "Software Engineer");

        System.out.println("First Name: " + avdeshEmployee.getFirstName());
        System.out.println("Last Name: " + avdeshEmployee.getLastName());
        System.out.println("Employee ID: " + avdeshEmployee.getEmployeeId());
    }
}