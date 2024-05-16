package ThirdClass;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book(); // Using default constructor
        Book book2 = new Book("SQA Automation", "Rashed", 266); // Using parameterized constructor

        System.out.println("Book 1 Details:");
        book1.displayDetails();
        System.out.println();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}
