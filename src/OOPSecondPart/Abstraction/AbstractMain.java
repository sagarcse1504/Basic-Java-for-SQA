package OOPSecondPart.Abstraction;

import OOPSecondPart.Polymorphism.Animal;
import OOPSecondPart.Polymorphism.Cat;
import OOPSecondPart.Polymorphism.Dog;

public class OverrideMain {
    public static void main(String[] args) {
        OOPSecondPart.Polymorphism.Dog dog = new Dog();
        dog.animalSound();

        OOPSecondPart.Polymorphism.Cat cat = new OOPSecondPart.Polymorphism.Cat();
        cat.animalSound();

        OOPSecondPart.Polymorphism.Animal cat2 = new Cat();
        cat2.animalSound();

        OOPSecondPart.Polymorphism.Animal animal = new Animal();
        animal.animalSound();
    }
}
