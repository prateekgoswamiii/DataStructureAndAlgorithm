import java.io.*;
import java.util.*;

public class InverseOfAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "
");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
      int n = a.length;
      int [] ans = new int[n];
      for(int i =0;i<n;i++){
          int idx=a[i];
          ans[idx]=i;
      }return ans;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}