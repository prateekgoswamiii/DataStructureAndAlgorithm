import java.util.*;

public class Print_All_Primes_Till_N{
    public static boolean isPrime(int n){
        for(int i =2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }return true;
    }
    public static void range(int a , int b){
        for(int i=a;i<=b;i++){
            if(isPrime(i))
                System.out.println(i);
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        range(scn.nextInt(),scn.nextInt());
    }
}
