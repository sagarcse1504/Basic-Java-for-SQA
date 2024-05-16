package Loop;

public class ForLooptest {
    public static void main(String[] args) {
        // Increment loop
        System.out.println("Increment loop: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Decrement loop
        System.out.println("Decrement loop: ");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // Loop with a condition
        System.out.println("Loop with condition: ");
        for (int i = 0; i < 10; i++) {
            if (i%2==0){
                System.out.println(i); //Print Even Number
            }
        }
    }
}
