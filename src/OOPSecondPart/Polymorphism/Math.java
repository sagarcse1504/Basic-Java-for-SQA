package OOPSecondPart;
//Overloading Example
public class Math {
    int num;
    public void addition(){
        int num1 = 10, num2 = 20;
        num = num1 + num2;
        System.out.println("Add result : "+num);
    }
    public void addition(int num2){
        int num1 = 10;
        num = num1 + num2;
        System.out.println("Add result : "+num);
    }
    public void addition(int num1, int num2){
        num = num1 + num2;
        System.out.println("Add result : "+num);
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.addition();
        math.addition(20);
        math.addition(45,96);

    }
}
