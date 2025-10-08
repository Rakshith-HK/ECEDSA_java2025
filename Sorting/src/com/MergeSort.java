package com; 
public class MergeSort {

    // Function to print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort function
    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //work
        int mid = si + (ei - si) / 2; // (si + ei) / 2
        mergeSort(arr, si, mid);      // Left part
        mergeSort(arr, mid + 1, ei);  // Right part
        merge(arr, si, mid, ei);      // Merge both parts
    }

    // Merge function
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;     // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0;       // Iterator for temp arr

        // Compare and merge
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
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

    // Main method
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Original Array:");
        printArr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArr(arr);
    }
}
