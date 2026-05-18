public class Gridways{
    public static int gridways(int i,int j,int n,int m){

        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i == n || j == n){ //boundary cross condition
            return 0;
        }
        int way1 = gridways(i+1,j,n,m);
        int way2 = gridways(i,j+1,n,m);
        return way1+way2;
    }

public static void main(String args[]){
    int n=3;
    int m=3;
    System.out.println(gridways(0,0,n,m));
}
}