import java.io.*;
import java.util.*;

public class SubarrayProblem{
    public static void printsubarray(int[] arr){
        int n = arr.length;
        //select start point
        for(int st=0;st<n;st++){
            //select end point
            for(int et=st;et<n;et++){
            //print st to et
                for(int k=st;k<=et;k++)
                        System.out.print(arr[k]+"	");
                System.out.println();
        }
        }
    }

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];
    for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
    printsubarray(arr);
 }

}