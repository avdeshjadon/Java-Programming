// Constructor Overloading - Book Class Example
//
// Problem: Write a Java program to demonstrate constructor overloading in a class.
// The program defines a Book class with three fields: title, author, and price.
// It includes three constructors:
//    1. Default constructor (no arguments)
//    2. Constructor with title and author
//    3. Constructor with title, author, and price
//
// Approach: The program creates objects using each constructor and prints the field values.
//
// Sample Output:
// null
// null
// 0.0
// Lady Gaga
// Avdesh Premchand
// 0.0
// Janeman
// Aman
// 10000.0

package OOPS.JavaConstructor;

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

public class ConstructorOverloadingBookExample {
    public static void main(String[] args) {
        // for default constructor
        Book defaultBook = new Book();
        System.out.println(defaultBook.title);
        System.out.println(defaultBook.author);
        System.out.println(defaultBook.price);
        
        // for second constructor
        Book avdeshBook = new Book("Lady Gaga", "Avdesh Premchand");
        System.out.println(avdeshBook.title);
        System.out.println(avdeshBook.author);
        System.out.println(avdeshBook.price);
        
        // for third constructor
        Book amanBook = new Book("Janeman", "Aman", 10000);
        System.out.println(amanBook.title);
        System.out.println(amanBook.author);
        System.out.println(amanBook.price);
    }
}