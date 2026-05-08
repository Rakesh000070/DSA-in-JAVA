// Given a number n, find the sum of first n natural numbers using recursion. 
 // n=10 
 // Output: Sum of first 10 natural numbers is: 55
  // Time Complexity: O(n)
 // Space Complexity: O(n) due to recursive stack space   
public class Recursion_P4 {

    public static int sum(int n){
if(n == 1){
    return 1;
}

int sumNm1 = sum(n - 1);
    int function = n + sumNm1;
    return function;
    }
    public static void main(String args[]){
        int n=5;
   sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
    }
}
