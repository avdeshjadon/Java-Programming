// HR Manager Employee Overriding
//
// Problem: Write a Java program to create a class called Employee with methods:
//     - work()
//     - getSalary()
//
// Then create a subclass called HRManager that:
//   Overrides work() method
//   Adds a new method called addEmployee()
//
// Sample Output:
// HR Manager is working
// Adding a new employee
// Salary: 50000

package OOPS.JavaInheritance;

class Employee {
    private int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working");
    }

    int getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    HRManager(int salary) {
        super(salary);
    }

    @Override
    void work() {
        System.out.println("HR Manager is working");
    }

    void addEmployee() {
        System.out.println("Adding a new employee");
    }
}

public class HRManagerEmployeeOverriding {
    public static void main(String[] args) {
        HRManager avdeshManager = new HRManager(50000);
        avdeshManager.work();
        avdeshManager.addEmployee();
        System.out.println("Salary: " + avdeshManager.getSalary());
    }
}