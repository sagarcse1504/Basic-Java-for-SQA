package Loop;

public class ContinueExample {
    public static void main(String[] args) {
        System.out.println("Continue loop: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i); //Print Odd number
        }

    }
}
