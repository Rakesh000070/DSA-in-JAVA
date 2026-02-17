//Print factorial of a number
//n=5 
//Output: Factorial of 5 is: 120
//Time Complexity: O(n)
//Space Complexity: O(n) due to recursive stack space
public class Recursion_P3 {
    public static int factorial(int n){
if(n == 0){
 return 1;
}

int fnm1=factorial(n-1);
   int function =n * fnm1;
   return function;
    }
public static void main (String args[]){
    int n=5;
    factorial(n);
    System.out.println("Factorial of " + n + " is: " + factorial(n));
}
    
}
