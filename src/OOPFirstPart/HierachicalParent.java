package Java6thAssignment;

public class HierachicalParent {
    protected String name;
    protected String course;

    public HierachicalParent(String name) {
        this.name = name;
        this.course = "SQA";
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
