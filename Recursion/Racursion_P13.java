                                        // Problem: Friends Pairing Problem
// Description: Given n friends, each one can either remain single or pair up with another friend. The task is to find the total number of ways in which friends can remain single or pair up.
// Approach: Use recursion to explore the choices of remaining single or pairing up. The base cases are when there is only one or two friends. For more than two friends, calculate the number of ways by considering both choices: remaining single and pairing up with another friend. The pairing choice involves choosing one friend to pair with and then calculating the ways for the remaining friends.
// Time Complexity: O(2^n) due to the exponential growth of choices.
// Space Complexity: O(n) due to the recursion stack.

public class Racursion_P13 {
    public static int friendspair(int n){
        if(n == 1 || n==2){
            return n;
        }

        //choice 
        //1. single
         int fnm1 = friendspair(n-1);
        //2. pair
        int fnm2 = friendspair(n-2);
        int pairways = (n-1) * fnm2;

        //total 
        int totalways = fnm1 +pairways;

        return totalways;
    }
    public static void main(String args[]){
       
        int n=10; //number of friends
        System.out.println(friendspair(n));
    }
}
