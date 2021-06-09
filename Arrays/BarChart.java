import java.util.*;

public class BarChart{
    public static void barChart(int[] arr){
        int max = -(int)1e9;
        for(int ele : arr){
                max=Math.max(max,ele);
        }
        for(int height = max ; height>=1;height--){
            for(int i=0;i<arr.length;i++){
                if(arr[i] >= height)
                        System.out.print("*	");
                else
                        System.out.print("	");
            }
            System.out.println();
        }
    }

public static void main(String[] args){
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i =0;i<arr.length;i++)
            arr[i]=scn.nextInt();
    barChart(arr);
 }

}