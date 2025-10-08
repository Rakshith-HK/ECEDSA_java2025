/*
 * Sort array of strings alphabetically
Input: {"banana", "apple", "cherry"}
Output: apple banana cherry

Hint: use .compareTo() for string comparison.
 */
package com;

public class InserctionSortExample {
	public static void main(String[] args) {
        String[] arr = {"banana", "apple", "cherry"};
        int n = arr.length;

        // Insertion Sort for Strings
        for (int i = 1; i < n; i++) {
            String current = arr[i];
            int j = i - 1;

            // compareTo() checks lexicographic order
            while (j >= 0 && arr[j].compareTo(current) > 0) {
                arr[j + 1] = arr[j];  // shift right
                j--;
            }

    arr[j + 1] = current;  // insert current string at correct position
        }

        // Print sorted strings
        System.out.println("Sorted Strings Alphabetically:");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}


