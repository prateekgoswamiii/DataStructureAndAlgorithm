import java.util.*;

public class pattern4 {
    public static void pat4(int n){
        int nst=n;
        int nsp=0;
        for(int row=1;row<=n;row++){
            for(int csp=1;csp<=nsp;csp++)
                    System.out.print("	");
            for(int cst=1;cst<=nst;cst++)
                    System.out.print("*	");
            
            
                  
            nst--;
            nsp++;
            System.out.println();  
    }}

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        pat4(scn.nextInt());

    }
}