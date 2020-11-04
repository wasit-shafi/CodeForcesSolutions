// https://codeforces.com/problemset/problem/1445/A?csrf_token=b819b1dab31feb9c3f49920efefc613a
/**
 *  @author WasitShafi
 *  @since 04-NOV-2020
 */
import java.util.Scanner;

public class Solution {
  public static String rearrangePossible(int x, int[] a, int[] b, int n) {
    for (int i = 0 ; i <= n; i++) {
      if (a[i] + b[n - i] > x) {
        return "No";
      }
    }
    return "Yes";
  }
  public static void main(String[] args) {
    StringBuilder output = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();
    int n;
    int x;
    int[] a;
    int[] b;

    while (t-- != 0) {
      n = scanner.nextInt();
      x = scanner.nextInt();
      a = new int[n];
      b = new int[n];

      for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
      }

      for (int i = 0; i < n; i++) {
        b[i] = scanner.nextInt();
      }
      output.append(rearrangePossible(x, a, b, n-1));
      if(t != 0) {
        output.append("\n");
      }
    }
    System.out.print(output);
  }
}
