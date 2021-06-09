import java.util.*;
  
  public class AnyBaseSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n, int m){
      int pow =1;
      int ans=0;
      int borrow=0;
      while(m!=0){
          int diff=borrow+m%10-n%10;
          n/=10;
          m/=10;
          if(diff<0){
              borrow=-1;
              diff+=b;
          }
          else
            borrow=0;
            
          ans+=diff*pow;
          pow*=10;
      }return ans;
   }
  
  }