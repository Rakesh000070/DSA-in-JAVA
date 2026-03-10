                            // Q.Write a function to calculate the power of a number using recursion
// Example: pow(2, 10) should return 1024
// Time complexity = O(n)
// Space complexity = O(n)

public class Recursion_P9 {
    public static int pow(int n, int x) {
        if (n == 0) {
            return 1;
        }
        return x * pow(n - 1, x);
    }
    public static void main(String args[]) {
        System.out.println(pow(10, 2)); // 2^10 = 1024
    }
}