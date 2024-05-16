package Loop;

public class ForLoopExampleWithArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Sagar", "Shakib", "Jony", "Tanvir"};

        // Iterating over numbers array
        System.out.println("Number: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Iterating over names array
        System.out.println("Name: ");
        for (String name : names) {
            System.out.println(name);

        }
    }
}
