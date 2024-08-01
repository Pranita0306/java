// Base class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

// Demonstrating method overloading
class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Runtime polymorphism
        Animal myAnimal;
        
        myAnimal = new Dog();  // Animal reference but Dog object
        myAnimal.sound();      // Output: Dog barks
        
        myAnimal = new Cat();  // Animal reference but Cat object
        myAnimal.sound();      // Output: Cat meows
        
        // Compile-time polymorphism
        MathOperations math = new MathOperations();
        
        System.out.println("Sum of 5 and 10: " + math.add(5, 10));             
        System.out.println("Sum of 5, 10, and 15: " + math.add(5, 10, 15));   
    }
}
