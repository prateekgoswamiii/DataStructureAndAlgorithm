import java.util.*;

public class pattern6 {
    public static void pat6(int n ){
        int nst = (n+1)/2;
        int nsp =1;
        for(int row =1 ; row<=n ; row++){
            for(int cst=1;cst<=nst;cst++)
                    System.out.print("*	");
            for(int csp=1;csp<=nsp;csp++)
                    System.out.print("	");
             for(int cst=1;cst<=nst;cst++)
                    System.out.print("*	");
            
            System.out.println();
            if(row<=n/2){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        pat6(scn.nextInt());
    }
}