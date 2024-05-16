package Java6thAssignment;

public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, int numOfDoors) {
        super(brand);
        this.numOfDoors = numOfDoors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numOfDoors);
    }
}
