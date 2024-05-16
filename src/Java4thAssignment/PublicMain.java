package Java4thAssignment;

public class PublicMain {
    public void Emplyee(){
        System.out.println("Method called from Own package");
    }
    public static void main(String[] args) {
        Class41.PublicModifier obj1 = new Class41.PublicModifier();         // Creating an object of PublicModifier class from Class41
        obj1.publicMethod();

        PublicMain emp = new PublicMain();
        emp.Emplyee();

    }
}
