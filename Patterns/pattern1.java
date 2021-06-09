import java.util.*;

public class pattern1{
    public static void pat1(int n){
        int nst=1;
        for(int row=1;row<=n;row++){
            for(int cst=1;cst<=nst;cst++)
                    System.out.print("*	");
                    
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        pat1(scn.nextInt());

    }
}