package FirstClass;

public class extraClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Hello World");
        Assignment obj = new Assignment();
        obj.assignment2();
        Math summation = new Math();
        summation.Sum(15,63);

    }
}

class Assignment{
    public void assignment2(){
        System.out.println("This is my 2nd FirstClass.Assignment of 1st class");
    }

}
class Math{
    public void Sum(int a, int b){
        int ans = 0;
        ans = a+b;
        System.out.println(ans);


    }

}