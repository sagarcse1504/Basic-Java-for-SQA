package Java4thAssignment;

public class IfelseIFladder {

    public static void main(String[] args) {
        int mark = 56;

        if (mark >= 80 && mark<=100){
            System.out.println("A+");
        }
        else if (mark >= 70 && mark<80) {
            System.out.println("A");
        }
        else if (mark >= 60 && mark<70){
            System.out.println("B");
        }
        else if (mark >= 50 && mark<60){
            System.out.println("C");
        }
        else if (mark >= 40 && mark<50){
            System.out.println("D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
