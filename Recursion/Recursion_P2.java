//Print number from 1 to n(Incresing Order)
//n = 10
//Output: 1 2 3 4 5 6 7 8 9 10
public class Recursion_P2 {
    public static void printInc(int n){

        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");  
    }
    public static void main(String args[]){
        int n=10;
        printInc(n);    
    }
}
