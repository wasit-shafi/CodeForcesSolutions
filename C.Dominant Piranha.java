//https://codeforces.com/problemset/problem/1433/C
/**
 *   @author WasitShafi
 *   @since 24-OCT-2020
 */
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    int t;
    int n;
    int max;
    int index;
    int arr[];
    Scanner scanner = new Scanner(System.in);

    t = scanner.nextInt();
    while (t-- != 0) {
      n = scanner.nextInt();
      arr = new int[n];
      max = -1;

      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
        if (arr[i] > max) {
          max = arr[i];
        }
      }
      index = -1;
      for (int i = 0; i < n; i++) {
        if (arr[i] == max) {
          if (i == 0) {
            if (i + 1 < n && arr[i] > arr[i+1]) {
              index = i + 1;
              break;
            }
          } else if (i == n - 1) {
             if (i-1 >= 0 && arr[i] > arr[i-1]) {
               index = i + 1;
               break;
             }
          } else if ((arr[i] > arr[i - 1]) || arr[i] > arr[i + 1]) {
            index = i + 1;
            break;
          }
        }
      }
      System.out.print(index);
      if (t != 0) {
        System.out.println();
      }
    }
    scanner.close();
  }
}
