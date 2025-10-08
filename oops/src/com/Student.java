package com;

public class Student {
	private String name;  // private data
    private int age;
    
    // Getter and Setter methods (controlled access)

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {   // validation
		this.age = age;
	}
}
}
