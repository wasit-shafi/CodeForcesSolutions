/**
 * @author WasitSahfi
 * @since 14-OCT-2020
 */
//https://codeforces.com/problemset/problem/1430/B
import java.util.Scanner;
import java.util.Arrays;

public class B_2_Barrels {  // TLE on TC 6
  public static void main(String[] args) {
    int t;
    int n;
    int k;
    long sum;
    int[] arr;
    int maxIndex;
    
    Scanner scanner = new Scanner(System.in);
    StringBuilder output = new StringBuilder("");
    t = scanner.nextInt();

    while (t-- != 0) {
      n = scanner.nextInt();
      k = scanner.nextInt();
      
      arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }

      Arrays.sort(arr);
      sum = 0L;
      for (int i = n - k - 1; i < n; i++) {
        sum += arr[i];
      }
      output.append(sum);
      if (t != 0) {
        output.append("\n");
      }
    }
    System.out.print(output);
  }
}