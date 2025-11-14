// ------------------- 🔹 Constructor Overloading - Book Class 🔹 -------------------
//
// 💡 Write a Java program to demonstrate **constructor overloading** in a class.
// The program defines a `Book` class with three fields: `title`, `author`, and `price`.
// It includes three constructors:
//    1. Default constructor (no arguments)
//    2. Constructor with `title` and `author`
//    3. Constructor with `title`, `author`, and `price`
//
// 🧠 The program creates objects using each constructor and prints the field values.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// null
// null
// 0.0
// Lady Gaga
// Munsi Premchand
// 0.0
// Janeman
// Avdesh
// 10000.0



package JavaConstructor;

class Book {
    String title;
    String author;
    double price;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class ConstructorOverloadingBookClass {

    public static void main(String[] args) {
        //for default constructor
        Book myBook = new Book();
        System.out.println(myBook.title);
        System.out.println(myBook.author);
        System.out.println(myBook.price);
        // for second constructor
        Book myBook1 = new Book("Lady Gaga", "Munsi Premchand");
        System.out.println(myBook1.title);
        System.out.println(myBook1.author);
        System.out.println(myBook1.price);
        //for third constructor
        Book myBook2 = new Book("Janeman", "Avdesh", 10000);
        System.out.println(myBook2.title);
        System.out.println(myBook2.author);
        System.out.println(myBook2.price);
    }
}
