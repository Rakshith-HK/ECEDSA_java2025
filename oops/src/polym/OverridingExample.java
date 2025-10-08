package polym;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal a;  // reference of parent

        a = new Dog();  // Dog object
        a.sound();      // Output: Dog barks

        a = new Cat();  // Cat object
        a.sound();      // Output: Cat meows
    }
}

		
