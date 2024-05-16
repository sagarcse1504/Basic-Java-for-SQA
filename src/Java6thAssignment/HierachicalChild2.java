package Java6thAssignment;

public class HierachicalChild2 extends HierachicalParent{
    public HierachicalChild2(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Membership: Premium");
    }
}
