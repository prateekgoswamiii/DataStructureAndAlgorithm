import java.util.*;
  
  public class Pythagorean_Triplet{
      public static boolean py(int a,int b,int c){
          return(a*a==b*b+c*c) || (b*b==c*c+a*a) || (c*c==a*a+b*b);
      }
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    boolean ans = py(scn.nextInt(),scn.nextInt(),scn.nextInt());
    System.out.println(ans);
      
  }
  }
