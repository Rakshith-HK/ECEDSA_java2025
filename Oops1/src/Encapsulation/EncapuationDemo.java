package Encapsulation;


public class EncapuationDemo {
	public static void main(String[] args) {
		Student s = new Student();
        s.setName("Rakshith");
        s.setId(1);

        System.out.println("Name: " + s.getName());
        System.out.println("id: " + s.getId());
	}
}
