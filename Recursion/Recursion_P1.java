//Print number from n to 1(Decresing Order)
//n = 10
//Output: 10 9 8 7 6 5 4 3 2 1
public class Recursion_P1 {

    public static void printDEC(int n){

        if(n ==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDEC(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDEC( n);
    }
}
