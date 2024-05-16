package Java6thAssignment;

public class WriteonlyEncapsulation {
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("Encapsulation Setter or Write: "+name);
    }
}
