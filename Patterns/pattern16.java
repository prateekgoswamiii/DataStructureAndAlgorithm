import java.util.*;

public class pattern16{
    public static void pat(int n){
        int nst=1;
        int nsp=(2*n-3);
        int val=1;
        for(int row=1;row<=n;row++){
            for(int cst=1;cst<=nst;cst++){
                    System.out.print(val+"	");
                    val++;
            }
            for(int csp=1;csp<=nsp;csp++)
                    System.out.print("	");
                    
            if(row==n){
                nst--;
                val--;
            }
            for(int cst=1 ;cst<=nst;cst++)
                    System.out.print(--val+ "	");
            
            nst++;
            nsp-=2;
            System.out.println();
    }}

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    pat(scn.nextInt());
 }
}