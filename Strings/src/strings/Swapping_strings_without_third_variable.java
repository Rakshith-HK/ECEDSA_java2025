package strings;

public class Swapping_strings_without_third_variable {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		//swapping 
		a = a + b;  // HelloWorld
		b = a.substring(0, a.length() - b.length()); //Hello
							// a.length = 10 - b.length = 5
  		a = a.substring(b.length());				//World
		
		System.out.println("a : " +a);
		System.out.println("b : " +b);
	}
}
