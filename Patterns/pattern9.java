import java.util.*;

public class pattern9 {
    public static void pat9( int n ){
        for(int row =1 ;row<=n;row++){
            for(int cst=1;cst<=n;cst++){
                if(row==cst || row+cst==n+1){
                    System.out.print("*	");
                }
                else
                    System.out.print("	");
            }System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        pat9(scn.nextInt());

    }
}