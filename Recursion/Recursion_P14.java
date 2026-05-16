
                       // Problem: Print all binary strings of length n with no consecutive 1's
// Description: Given an integer n, the task is to print all binary strings of length n
// such that there are no consecutive 1's in the string.
// Approach: Use recursion to build the binary strings. The function keeps track of the last character
// added to the string. If the last character is '0', it can add either '0' or '1'. If the last character is '1',
// it can only add '0' to avoid consecutive 1's. The recursion continues until the string reaches the desired length.
// Time Complexity: O(2^n) in the worst case, as each position can have two choices (0 or 1), but the constraint of no consecutive 1's reduces the number of valid strings.
// Space Complexity: O(n) for the recursion stack and the string being built.
public class Recursion_P14 {

    public static void printbinarystr(int n,int lastplace,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
         printbinarystr(n-1,0,str+"0");
        if(lastplace == 0){
            printbinarystr(n-1,1,str+"1");
    }
}

    public static void main(String args[]){
          printbinarystr(3,0," ");
    }
}
