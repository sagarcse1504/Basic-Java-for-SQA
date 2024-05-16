package Java6thAssignment;

public class HierachicalMain {
    public static void main(String[] args) {
        HierachicalChild1 regularStudent = new HierachicalChild1("Sagar");
        HierachicalChild2 premiumStudent = new HierachicalChild2("Sumaiya");

        System.out.println("Regular Student Information:");
        regularStudent.displayInfo();
        System.out.println();

        System.out.println("Premium Student Information:");
        premiumStudent.displayInfo();
    }
}
