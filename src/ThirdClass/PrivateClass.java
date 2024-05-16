package ThirdClass;

public class PrivateClass {
    private String name;

    public PrivateClass(String name) {
        this.name = name;
    }
public  PrivateClass(){



}
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        PrivateClass PrivateClassobj = new PrivateClass();
        PrivateClassobj.name = "SQA";

        System.out.println("Name: " + PrivateClassobj.getName());


    }
}
