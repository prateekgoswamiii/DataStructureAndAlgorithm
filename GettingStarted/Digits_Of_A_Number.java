import java.util.*;
public class Digits_Of_A_Number{
    public static int power(int n){
        n/=10;
        int pow =1;
        while(n!=0){
            n/=10;
            pow*=10;
        }return pow;
    }
    public static void digitnumber(int n ){
        int pow = power(n);
        while(pow!=0){
            int digit = n/pow;
            n%=pow;
            pow/=10;
            System.out.println(digit);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        digitnumber(scn.nextInt());
    }
}
