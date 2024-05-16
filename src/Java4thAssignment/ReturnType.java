package Java4thAssignment;

public class ReturnType {
    //a Class with void, non void, without Param & with Param; create Object and call those methods
    public void printSomething(){
        System.out.println("Hey! I am here for your Printing the result...");
        Sum();
    }
    public int Sum(){
        int a = 10,b = 15,ans;
        ans = a+b;
        return ans;
    }
    public String Sringtest(){
        int a = 50, b = 35, x;
        String c = "Hi";
        x = a - b;
        return c;
    }
    public float divide(float x, float y){
        float z;
        z = x/y;
        return z;
    }
    public static void main(String[] args) {
        ReturnType prnt = new ReturnType();
        prnt.printSomething();
        System.out.println("Summation result is: "+prnt.Sum());
        System.out.println("Sringtest result is: "+prnt.Sringtest());
        System.out.println("Divide result: "+prnt.divide(84,74));


    }

}
