package Java4thAssignment;

public class nestedifStatement {
    public static void main(String[] args) {
        int num = 11;
        if (num >= 5) {
            if (num <= 10){
                System.out.println("Number is between 5 to 10");
            }
            else if (num > 10) {
                System.out.println("Number is greater than 10");

            }
        }
        else {
            System.out.println("Invalid!");
        }
    }
}

