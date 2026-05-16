//Write a function to find the first occurance of the element in an array
//array=[1,2,6,4,5,8,7,9,5]
//key=5
//Time complexity = O(n)
//Space complexity = O(n)

public class Recursion_P7 {
    public static int firstoccurance(int i,int key,int arr[]){
        if(i ==arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
          return firstoccurance(i+1, key, arr);
    }
    public static void main(String args[]){
        int arr[]={1,2,6,4,5,8,7,9,5};
        System.out.println(firstoccurance(0,5,arr));
    }
}
