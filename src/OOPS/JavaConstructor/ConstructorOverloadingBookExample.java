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
// Education
// Avdesh
// 0.0
// Education
// Avdesh
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
        System.out.print(defaultBook.title+"  ");
        System.out.print(defaultBook.author+"  ");
        System.out.println(defaultBook.price);
        
        // for second constructor(parameterized constructor with two parameters)
        Book avdeshBook = new Book("Education", "Avdesh");
        System.out.print(avdeshBook.title+"  ");
        System.out.print(avdeshBook.author+"  ");
        System.out.println(avdeshBook.price);
        
        // for third constructor(Parameterized constructor with three parameters)
        Book amanBook = new Book("Education", "Avdesh", 10000);
        System.out.print(amanBook.title+" ");
        System.out.print(amanBook.author+" ");
        System.out.println(amanBook.price);
    }
}