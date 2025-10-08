package strings;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		
		// Anagrams have same number of characters and in same frequency
		if (str1.length() != str2.length())
			System.out.println("Not Anagram");
		
		// check if length are same
		else
		{
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if (Arrays.equals(arr1, arr2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		
		
		// if yes check the character frequency
		
	}
}
