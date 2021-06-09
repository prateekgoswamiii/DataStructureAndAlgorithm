import java.util.*;

public class pattern14 {
    public static void table(int n){
        for(int i =1;i<=10;i++)
                System.out.println(n+ " * " + i +" = " + (n*i));
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        table(scn.nextInt());
    }
}