/**
 * @author WasitSahfi
 * @since 13-OCT-2020
 */
// https://codeforces.com/problemset/problem/1430/A
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    int t;
    int n;
    int i;
    int j;
    int k;
    Scanner scanner = new Scanner(System.in);
    StringBuilder output = new StringBuilder("");

    t = scanner.nextInt();
    while (t-- != 0) {
      n = scanner.nextInt();
      if (n % 3 == 0) {
          output.append(n / 3 + " 0 0");
      } else if (n % 5 == 0) {
        output.append("0 "+ n / 5 + " 0");
      } else if (n % 7 == 0) {
        output.append("0 0 " + n / 7);
      } else {
        i = j = k = 0;
        loop: for (i = 0; i <= n; i += 3) { // labled loops in java
          for (j = 0; i + j <= n; j += 5) {
            for (k = 0; i + j + k <= n; k+= 7) {
              if (i + j + k == n) {
                break loop;
              }
            }
          }
        }
        if (i + j + k == n) {
          output.append( i / 3 + " " + j / 5 + " " + k / 7);
        } else {
          output.append("-1");
        }          
      }
      if (t != 0) {
        output.append("\n");
      }
    }
    System.out.print(output);
  }
}