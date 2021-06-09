import java.util.*;
  
  public class pattern17{
      public static void pat(int n){
        int nst=1;
        int nsp=n/2;
        for(int row=1;row<=n;row++){
          for(int csp=1;csp<=nsp;csp++){
              if(row==(n+1)/2)
                  System.out.print("*	");
              else
                  System.out.print("	");
          }
          for(int cst=1;cst<=nst;cst++)
                  System.out.print("*	");

          System.out.println();
          if(row<=n/2)
              nst++;
          else
              nst--;
        }
      }
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    pat(scn.nextInt());
      
  }
  }