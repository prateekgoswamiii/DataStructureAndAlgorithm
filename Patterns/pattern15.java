import java.util.*;
  
  public class pattern15{
      public static void pat(int n){
        int nst=1;
        int nsp=n/2;
        int rst=1;
        
        for(int row=1;row<=n;row++){
          for(int csp=1;csp<=nsp;csp++)
                System.out.print("	");
          int var=rst;
          for(int cst=1;cst<=nst;cst++){  
                System.out.print(var+"	");
              if(cst<=nst/2)
                var++;
              else  
                var--;
          }
        System.out.println();
         if(row<=n/2){
            nsp--;
            nst+=2;
            rst++;
          }
        else{
          nsp++;
          nst-=2;
          rst--;
        }
      }
      }
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    pat(scn.nextInt());
      
  }
  }