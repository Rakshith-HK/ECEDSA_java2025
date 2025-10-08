package com;

public class Number_of_digits {
	public static void main(String[] args) {
		long num = 1234567890987654321L;
		int count = 0;
		
		while (num > 0)
		{
			num = num / 10;
			count++;
		}
		System.out.println("The number of digits are " +count);
	}
}
