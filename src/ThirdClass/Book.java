package ThirdClass;


public class Book {
    // Instance variables
    private String title;
    private String author;
    private int pages;

    // Constructors
    public Book() {
        // Default constructor
        this.title = "SQA Learning Academy";
        this.author = "Hiro Mia";
        this.pages = 256;
    }

    public Book(String title, String author, int pages) {
        // Parameterized constructor
        this.title = title;
        this.author = author;
        this.pages = pages;
    }


    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

