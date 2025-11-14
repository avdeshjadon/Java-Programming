// ------------------- 🔹 10. Employee Class Hierarchy 🔹 -------------------
//
// 💡 Write a Java program to create a class hierarchy for employees of a company.
// The base class should be `Employee`, with subclasses:
//     - `Manager`
//     - `Developer`
//     - `Programmer`
//
// Each subclass should have:
//     ✅ name
//     ✅ address
//     ✅ salary
//     ✅ job title
//
// Implement methods to:
//     🔸 Calculate bonus (10% of salary)
//     🔸 Generate performance report
//     🔸 Manage projects
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Manager: Name- Amrita, Address- Shiv coloney, Radaur, Salary- 87000.0, Job Title- Manager
// Bonus: 8700.0
// Generating the performance report -----
// Managing Project -----

// Developer: Name- Avdesh, Address- Jatpura Agra, Salary- 736477.32, Job Title- Developer
// Bonus: 73647.732
// Generating the performance report -----
// Managing Project -----

// Programmer: Name- Sachin, Address- Garreb gali rohtak, Salary- 646443.33, Job Title- programmer
// Bonus: 64644.333
// Generating the performance report -----
// Managing Project -----



package OOPS.JavaInheritance;

class Employee2 {
    private String name;
    private String address;
    private double salary;
    private String job_title;

    Employee2(String name, String address, double salary, String job_title) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }

    public void display() {
        System.out.println(getClass().getSimpleName() + ": Name- " + getName() + ", Address- " + getAddress() + ", Salary- " + getSalary() + ", Job Title- " + getJob_title());
        System.out.println("Bonus: " + bonus());
        genratePerformanceReport();
        System.out.println();
        manageproject();
        System.out.println();
        System.out.println();
    }

    public double bonus() {
        return salary * 0.10;
    }

    public void genratePerformanceReport() {
        System.out.printf("Generating the performance report -----");
    }

    public void manageproject() {
        System.out.printf("Managing Project -----");
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

    public String getJob_title() {
        return job_title;
    }
}

class Manager extends Employee2 {
    Manager(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);
    }
}

class Developer extends Employee2 {
    Developer(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);
    }
}

class Programmer extends Employee2 {
    Programmer(String name, String address, double salary, String job_title) {
        super(name, address, salary, job_title);
    }
}

public class EmployeeClassHierarchy {
    public static void main(String[] args) {
        Manager manager = new Manager("Amrita", "Shiv coloney, Radaur", 87000, "Manager");
        Developer developer = new Developer("Avdesh", "Jatpura Agra", 736477.32, "Developer");
        Programmer programmer = new Programmer("Sachin", "Garreb gali rohtak", 646443.33, "programmer");
        manager.display();
        developer.display();
        programmer.display();
    }
}

