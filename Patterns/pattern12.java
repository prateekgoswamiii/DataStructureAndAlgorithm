import java.util.*;

public class Main {
    
    public static void pattern12(int n){
        int nst=1;
        int a=0;
        int b=1;
        for(int row=1;row<=n;row++){
            for(int cst=1;cst<=nst;cst++){
                    System.out.print(a + "	");
                                                                                                                                                                                                                                  
            int temp=a+b;
            a=b;
            b=temp;
                
            }
            nst++; 
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        pat11(scn.nextInt());

    }
}