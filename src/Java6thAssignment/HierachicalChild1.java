package Java6thAssignment;

public class HierachicalChild1 extends HierachicalParent {
    public HierachicalChild1(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Membership: Regular");
    }

}
