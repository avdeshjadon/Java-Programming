package PEP;

public class CollegeData {
    public static void main(String[] args) {
        Student obj = new Student();

        System.out.println("Name: " + obj.name);
        System.out.println("Section: " + obj.section);
        System.out.println("Age: " + obj.age);
        System.out.println("Roll No: " + obj.roll_no);
    }
}

class Student {
    String name = "Avdesh";
    String section = "K45";
    int age = 20;
    int roll_no = 36;
}
