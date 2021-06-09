import java.util.*;

public class pattern3 {
    public static void pat3(int n){
        int nst=1;
        int nsp=n-1;
        for(int row=1;row<=n;row++){
            for(int csp=1;csp<=nsp;csp++)
                    System.out.print("	");
            for(int cst=1;cst<=nst;cst++)
                    System.out.print("*	");
            
            nst++;
            nsp--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
pat3(scn.nextInt());

    }
}