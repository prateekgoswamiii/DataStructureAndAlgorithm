import java.util.*;

public class pattern11 {
    
    public static void pat11(int n){
        int nst=1;
        int var=1;
        for(int row=1;row<=n;row++){
            for(int cst=1;cst<=nst;cst++)
                    System.out.print(var++ + "	");
            nst++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        pat11(scn.nextInt());

    }
}