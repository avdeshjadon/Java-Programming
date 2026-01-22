// Company Employee Hierarchy
//
// Problem: Write a Java program to create a class hierarchy for employees of a company.
// The base class should be Employee, with subclasses:
//     - Manager
//     - Developer
//     - Programmer
//
// Each subclass should have:
//     name
//     address
//     salary
//     job title
//
// Implement methods to:
//     Calculate bonus (10% of salary)
//     Generate performance report
//     Manage projects
//
// Sample Output:
// Manager: Name- Avdesh, Address- Shiv colony, Radaur, Salary- 87000.0, Job Title- Manager
// Bonus: 8700.0
// Generating the performance report
// Managing Project
//
// Developer: Name- Aman, Address- Jatpura Agra, Salary- 736477.32, Job Title- Developer
// Bonus: 73647.732
// Generating the performance report
// Managing Project
//
// Programmer: Name- Avi, Address- Garreb gali rohtak, Salary- 646443.33, Job Title- programmer
// Bonus: 64644.333
// Generating the performance report
// Managing Project

package OOPS.JavaInheritance;

class Employee2 {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    Employee2(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void display() {
        System.out.println(getClass().getSimpleName() + ": Name- " + getName() + ", Address- " + getAddress() + ", Salary- " + getSalary() + ", Job Title- " + getJobTitle());
        System.out.println("Bonus: " + calculateBonus());
        generatePerformanceReport();
        manageProject();
        System.out.println();
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public void generatePerformanceReport() {
        System.out.println("Generating the performance report");
    }

    public void manageProject() {
        System.out.println("Managing Project");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}

class Manager extends Employee2 {
    Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }
}

class Developer extends Employee2 {
    Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }
}

class Programmer extends Employee2 {
    Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }
}

public class CompanyEmployeeHierarchy {
    public static void main(String[] args) {
        Manager avdeshManager = new Manager("Avdesh", "Shiv colony, Radaur", 87000, "Manager");
        Developer amanDeveloper = new Developer("Aman", "Jatpura Agra", 736477.32, "Developer");
        Programmer aviProgrammer = new Programmer("Avi", "Garreb gali rohtak", 646443.33, "programmer");
        
        avdeshManager.display();
        amanDeveloper.display();
        aviProgrammer.display();
    }
}