                 //Q. This code calculates the nth Fibonacci number using recursion.


// Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, ... 
// The nth Fibonacci number is the sum of the (n-1)th and (n-2)th Fibonacci numbers.    
// Base cases: fibonacci(0) = 0, fibonacci(1) = 1   
// Time complexity: O(2^n) due to the exponential growth of recursive calls.
// Space complexity: O(n) due to the call stack.    
// Example: fibonacci(5) returns 5, as the sequence is 0, 1, 1, 2, 3, 5.
public class Recursion_P5 {
    public static int fibonacci(int n){
if(n==0 || n==1){
    return n;
}

        int fnm1=fibonacci(n-1);
        int fnm2=fibonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
