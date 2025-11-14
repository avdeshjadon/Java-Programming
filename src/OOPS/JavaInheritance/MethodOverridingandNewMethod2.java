// ------------------- 🔹 7. Method Overriding and New Method 🔹 -------------------
//
// 💡 Write a Java program to create a class called `Person` with methods:
//     - `getFirstName()`
//     - `getLastName()`
//
// Then create a subclass called `Employee1` that:
//   ✅ Overrides the `getLastName()` method to include the job title
//   ✅ Adds a new method called `getEmployeeId()`
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// First Name: Amrita
// Last Name: Ghatoye - Software Engineer
// Employee ID: E12345


package JavaInheritance;

class Person {
    private String fname;
    private String lname;

    Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    String getFirstName() {
        return fname;
    }

    String getLastName() {
        return lname;
    }
}

class Employee1 extends Person {
    private String employeeId;
    private String jobTitle;

    Employee1(String fname, String lname, String employeeId, String jobTitle) {
        super(fname, lname);
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

public class MethodOverridingandNewMethod2 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1("Amrita", "Ghatoye", "E12345", "Software Engineer");

        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
