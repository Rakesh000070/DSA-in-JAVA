                                //  Q.This code finds the last occurrence of a key in an array using recursion.
// The function returns the index of the last occurrence or -1 if not found.
// Time complexity = O(n)
// Space complexity = O(n)

public class Recursion_P8 {
    public static int lastoccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isfound = lastoccurance(arr, key, i + 1);

        if (isfound != -1) {
            return isfound;
        }
        if (arr[i] == key) {
            return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 8, 5, 6, 7, 9, 5, 7};
        System.out.println(lastoccurance(arr, 5, 0));
    }
}