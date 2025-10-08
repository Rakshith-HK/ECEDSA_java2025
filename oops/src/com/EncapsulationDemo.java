package com;

public class EncapsulationDemo {
	public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rakshith");
        s.setAge(22);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

