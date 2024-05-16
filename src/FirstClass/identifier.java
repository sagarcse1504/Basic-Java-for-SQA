package FirstClass; //Pakage Identifier

public class identifier { //Class Identifier
    int age = 25;

    public void printAge() {//Method Identifier
        System.out.println("Age is: "+age+" from method");
    }

    public static void main(String[] args) {
        System.out.println("HI I am Sagar from main class");
        identifier testing = new identifier(); //Object identifier
        testing.printAge();
    }
}
