
                             // Problem:-This Java program implements the Merge Sort algorithm.
// Merge Sort is a divide-and-conquer algorithm that sorts an array by recursively dividing it into halves,
// sorting each half, and then merging the sorted halves back together.
// It has a time complexity of O(n log n) and is stable, meaning it maintains the relative order of equal elements.
// The program includes utility methods to print the array and perform the merge sort operation.
//
public class MergeSort {

    // Utility method to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Recursive method to divide and sort the array
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;  // Avoid overflow
        mergesort(arr, si, mid);      // Sort left half
        mergesort(arr, mid + 1, ei);  // Sort right half
        merge(arr, si, mid, ei);      // Merge sorted halves
    }

    // Method to merge two sorted halves
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;       // Pointer for left half
        int j = mid + 1;  // Pointer for right half
        int k = 0;        // Pointer for temp array

        // Merge elements in sorted order
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back to original array
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    // Main method to test the merge sort
    public static void main(String args[]) {
        int arr[] = {3, 2, 9, 7, 78};
        System.out.println("Before sorting:");
        printArr(arr);
        mergesort(arr, 0, arr.length - 1);
        System.out.println("After sorting:");
        printArr(arr);
    }
}
