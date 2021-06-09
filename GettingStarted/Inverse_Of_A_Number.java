import java.util.*;

public class Inverse_Of_A_Number{
    public static int inverse(int n){
        int facevalue=0;
        int ans=0;
        while(n!=0){
            facevalue++; //facevalue =1,2,3,4,5
            int rd=n%10;
            n/=10;
            
            ans+=facevalue*(int) (Math.pow(10,rd-1));
        }return ans;
    }

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println(inverse(scn.nextInt()));
 }
}
