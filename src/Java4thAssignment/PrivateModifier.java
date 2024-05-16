package Java4thAssignment;

public class PrivateModifier {
    private void privateMethod(){
        String name = "Sagar";
        System.out.println(name);

    }
    public static void main(String[] args) {
        PrivateModifier pvt = new PrivateModifier();
        pvt.privateMethod();

    }
}
