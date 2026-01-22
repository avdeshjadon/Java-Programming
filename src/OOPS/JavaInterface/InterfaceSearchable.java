// Searchable Interface with Keyword Search
//
// Problem: Write a Java program to create an interface Searchable with a method search(String keyword)
// that searches for a given keyword in a text document. Create two classes Document and WebPage
// that implement the Searchable interface and provide their own implementations of the search() method.
//
// Sample Output:
// Document contains keyword 'sample': true
// Webpage contains keyword 'webpage': true

package OOPS.JavaInterface;

interface Searchable {
    boolean search(String keyword);
}

class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content.toLowerCase().contains(keyword.toLowerCase());
    }
}

class WebPage implements Searchable {
    private String htmlContent;

    public WebPage(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    public boolean search(String keyword) {
        return htmlContent.toLowerCase().contains(keyword.toLowerCase());
    }
}

public class InterfaceSearchable {
    public static void main(String[] args) {
        Document avdeshDocument = new Document("This is a sample document with various content for Avdesh.");
        WebPage amanWebpage = new WebPage("Welcome to Aman's webpage with lots of information.");

        boolean docResult = avdeshDocument.search("sample");
        boolean webResult = amanWebpage.search("webpage");

        System.out.println("Document contains keyword 'sample': " + docResult);
        System.out.println("Webpage contains keyword 'webpage': " + webResult);
    }
}