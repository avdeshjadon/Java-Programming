// ------------------- 🔹Member Inner Class (Accessing Outer Class Members) -------------------
//
// 💡 Write a Java program to demonstrate a **member inner class** accessing members of the outer class.
// Create a class `Library` with a private field `libraryName` and a constructor to initialize it.
// Inside it, define a **member inner class** `Book` with a method `getLibraryName()`
// that returns the name of the outer library.
//
// In the `main` method, create an instance of the outer class and the inner class,
// then call the method to print the library name.
//
// ------------------- 🧾 SAMPLE OUTPUT -------------------
// Library Name : Central Library


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

public class JavaNestedClasses5 {
    public static void main(String[] args) {
        Library library = new Library("Central Library");
        Library.Book book = library.new Book();
        System.out.println("Library Name : " + book.getLibraryName());

    }
}
