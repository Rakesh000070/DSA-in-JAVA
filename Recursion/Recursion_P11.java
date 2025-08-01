               // Q.Given "2*n" board and tiles of size "2*1", find the number of ways to tile the board using recursion.
//(A tile can be placed either vertically or horizontally)
// Example: tilingproblem(7) should return 21
// Time complexity = O(2^n)
// Space complexity = O(n)

public class Recursion_P11 {
    public static int tilingproblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        //Vertical Choice
    int var1 = tilingproblem(n-1);

    //Horizontal choice
    int var2 = tilingproblem(n-2);

    int totalway = var1 + var2;
           return totalway;
    }
    public static void main(String args[]){
              System.out.println(tilingproblem(7));
    }
}
