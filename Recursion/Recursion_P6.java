     //Q. Given an array of integers, write a recursive function to check if the array is sorted in ascending order.

// The function should return true if the array is sorted, and false otherwise.
// Time complexity: O(n) where n is the length of the array, as we traverse the array once.
// Space complexity: O(n) due to the call stack used in recursion.
// Example: For the array [1, 2, 3, 4, 5], the function should return true.
public class Recursion_P6 {
    public static boolean isSorted(int arr[],int i){
        
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] >arr[i+1]){
            return false;
       }
       return isSorted(arr, i+1);
        }
    
    public static void main(String args[]){
int arr[]={1,2,3,4,5};
      System.out.println(isSorted(arr,0));
}
}
