//                     Q.Write a function to calculate the power of a number using recursion
// Example: pow(2, 10) should return 1024
// Time complexity = O(log n)
// Space complexity = O(log n)

public class Recursion_P10 {
    public static int pow(int a,int n){
        if(n == 0){
            return 1;
        }

        int halfpower = pow(a,n/2);
        int halfpowersquare = halfpower * halfpower;

        //n is odd
        if(n%2 != 0){
            halfpowersquare = a * halfpowersquare;
        }
        return   halfpowersquare;
    }

    public static void main(String args[]){
       int n=5;
       int a=2;

       System.out.println(pow(a,n));

    }
}
