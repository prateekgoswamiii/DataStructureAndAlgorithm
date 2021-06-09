import java.util.*;
  
  public class AnyBaseAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n, int m){
       int ans=0;
       int carry=0;
       int pow=1;
       while(n!=0 || m!=0 || carry!=0){
           int sum = carry + n%10 + m%10;
           n/=10;
           m/=10;
           
           int digit = sum%b;
           carry=sum/b;
           
           ans+=digit*pow;
           pow*=10;
       }return ans;
   }
  }