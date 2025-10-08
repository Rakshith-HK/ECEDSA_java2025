package com;

import java.util.Arrays;

public class Merge_sort {
	public static void main(String[] args) {
		int[] arr = {6, 3, 9, 5, 2, 8};
		System.out.println(Arrays.toString(arr));
		//calling the mergesort function to sort the array
		mergeSort(arr, 0, arr.length - 1);
		//printing the array after sorting
		System.out.println(Arrays.toString(arr));
	}
	//function with array, starting index, ending index as parameters
	private static void mergeSort(int[] arr, int si, int ei) {
		if (si >= ei)
			return ;
		
		int mid = (si + ei)/2;
		mergeSort(arr, si, mid);
		mergeSort(arr, mid + 1, ei);
		merge(arr, si, mid, ei);
	}
	// calling merge fuction to merge the sorted arrays
	private static void merge(int[] arr, int si, int mid, int ei) {
		int temp[] = new int[ei - si + 1];
		int i = si;
		int j = mid + 1;
		int k = 0;
		
		while (i <= mid && j <= ei)
		{
			if (arr[i] < arr[j])
			{
				temp[k++] = arr[i++];
			}
			else
			{
				temp[k++] = arr[j++];
			}
		}
		// Copy remaining elements(left part)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //(right part)
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
	}
}
