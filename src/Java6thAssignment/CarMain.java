package Java6thAssignment;

public class CarMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Generic Vehicle");
        Car car = new Car("Toyota", 4);
        SportsCar sportsCar = new SportsCar("Ferrari", 2, true);

        vehicle.displayInfo();     // Output: Brand: Generic Vehicle
        car.displayInfo();         // Output: Brand: Toyota, Number of doors: 4
        sportsCar.displayInfo();   // Output: Brand: Ferrari, Number of doors: 2,  Turbocharged: true
    }
}
