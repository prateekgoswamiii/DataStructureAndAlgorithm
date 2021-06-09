import java.util.*;
public class Main{
    public static int Digit_Frequency(int n, int d){
        int count=0;
        while(n!=0){
            int lastdigit=n%10;
            n/=10;
            if(lastdigit==d)
                count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int ans = digit(scn.nextInt(),scn.nextInt());
        System.out.println(ans);
    }
}