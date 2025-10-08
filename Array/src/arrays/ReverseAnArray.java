package arrays;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(Arrays.toString(arr));
		
		//expected output {4, 3, 2, 1}
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end)
		{
			int temp = arr[end];  // Swapping logic
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
