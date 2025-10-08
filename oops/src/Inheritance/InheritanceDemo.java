package Inheritance;

public class InheritanceDemo {
	
	public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog’s own method
    }
}
