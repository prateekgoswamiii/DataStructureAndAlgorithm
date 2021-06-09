import java.util.*;

public class AnyBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n = scn.nextInt();
    int m = scn.nextInt();

    int d = anyBaseMultiplication(b, n, m);
    System.out.println(d);
 }
 public static int multiplicationByoneDigit(int b,int n,int d){
     int pow=1;
     int ans=0;
     int carry=0;
     while(n!=0 || carry!=0){
         int mul = carry+(n%10)*d;
         n/=10;
         int digit=mul%b;
         carry=mul/b;
          ans+=digit*pow;
          pow*=10;
     }return ans;
 }
 
 public static int anybaseAddition(int b,int n,int m){
     int pow=1;
     int ans=0;
     int carry=0;
     while(n!=0 || m!=0 || carry!=0){
         int sum = carry+n%10+m%10;
         n/=10;
         m/=10;
         int digit=sum%b;
         carry=sum/b;
          ans+=digit*pow;
          pow*=10;
     }return ans;
 }

 public static int anyBaseMultiplication(int b, int n, int m){
     int pow=1;
     int ans=0;
     while(m!=0){
         int d = m%10;
         m/=10;
         
         int productRes = multiplicationByoneDigit(b,n,d)*pow;
         
         ans=anybaseAddition(b,ans,productRes);
         pow*=10;
     }return ans;
 }

}