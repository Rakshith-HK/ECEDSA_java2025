package com;

public class Quick_Sort {
	
	    // Function to perform quicksort
	    public static void quickSort(int arr[], int si, int ei) {
	        if (si >= ei)
	            return;

	        // Partition the array
	        int pIdx = partition(arr, si, ei);

	        // Recursively sort the left and right subarrays
	        quickSort(arr, si, pIdx - 1);
	        quickSort(arr, pIdx + 1, ei);
	    }

	    // Function to partition the array
	    public static int partition(int arr[], int si, int ei) {
	        int pivot = arr[ei];
	        int i = si - 1;

	        for (int j = si; j < ei; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Place pivot at the correct position
	        i++;
	        int temp = arr[i];
	        arr[i] = arr[ei];
	        arr[ei] = temp;

	        return i; // Pivot index
	    }

	    // Utility function to print array
	    public static void printArr(int arr[]) {
	        for (int val : arr)
	            System.out.print(val + " ");
	        System.out.println();
	    }

	    // Main method
	    public static void main(String[] args) {
	        int arr[] = {6, 3, 9, 8, 2, 5};
	        System.out.println("Original Array:");
	        printArr(arr);

	        quickSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted Array:");
	        printArr(arr);
	    }
	}





