package com;

import java.util.Scanner;

public class Fibbonacci {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("The fibonacci series is : ");
		System.out.print(n1+ " ");
		System.out.print(n2+ " ");
		
		for (int i = 2; i < n; i++)
		{
			n3 = n2 + n1;
			System.out.print(n3+ " ");
			n1 = n2;
			n2 = n3;
		}
	}
}
