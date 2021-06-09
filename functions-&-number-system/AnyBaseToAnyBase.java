import java.util.*;
  
  public class AnyBaseToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int destBase= scn.nextInt();
      int dec = getValueIndecimal(n,sourceBase);
      int ans = getValueInBase(dec,destBase);
      System.out.println(ans);
      
   }   
  
    public static int getValueIndecimal(int n, int b){
      int pow=1;
      int ans=0;
      while(n!=0){
          int rem=n%10;
          n/=10;
          ans+=rem*pow;
          pow*=b;
      }return ans;
   }
      public static int getValueInBase(int n, int b){
       int pow=1;
       int ans=0;
       while(n!=0){
           int rem=n%b;
           n/=b;
           ans+=rem*pow;
           pow*=10;
       }return ans;
   }}