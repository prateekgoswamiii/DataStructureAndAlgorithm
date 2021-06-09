import java.util.*;

public class pattern5 {
    public static void pat5(int n){
        int nst=1;
        int nsp=n/2;
        for(int row =1;row<=n;row++){
            for(int csp=1;csp<=nsp;csp++)
                    System.out.print("	");
            for(int cst=1;cst<=nst;cst++)
                    System.out.print("*	");
                    
            System.out.println();
            if(row<=n/2){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
        }}
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       pat5(scn.nextInt());

    }
}