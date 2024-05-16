package Java6thAssignment;

public class SportsCar extends Car {
    private boolean isTurbocharged;

    public SportsCar(String brand, int numOfDoors, boolean isTurbocharged) {
        super(brand, numOfDoors);
        this.isTurbocharged = isTurbocharged;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Turbocharged: " + isTurbocharged);
    }
}
