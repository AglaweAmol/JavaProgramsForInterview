package Abstraction;


abstract class Animal {

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();        // This animal eats food.
        dog.makeSound();  // The dog barks.
    }
}
