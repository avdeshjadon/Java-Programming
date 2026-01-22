// Member Inner Class - Library Book Access
//
// Problem: Write a Java program to demonstrate a member inner class accessing members of the outer class.
// Create a class Library with a private field libraryName and a constructor to initialize it.
// Inside it, define a member inner class Book with a method getLibraryName()
// that returns the name of the outer library.
//
// In the main method, create an instance of the outer class and the inner class,
// then call the method to print the library name.
//
// Sample Output:
// Library Name: Central Library

package OOPS.JavaNestedClass;

class Library {
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public class Book {
        public String getLibraryName() {
            return libraryName;
        }
    }
}

public class MemberInnerClassLibrary {
    public static void main(String[] args) {
        Library avdeshLibrary = new Library("Central Library");
        Library.Book amanBook = avdeshLibrary.new Book();
        System.out.println("Library Name: " + amanBook.getLibraryName());
    }
}