// https://codeforces.com/problemset/problem/1455/A
/**
 *  @author WasitShafi
 *  @since 03-DEC-2020
 */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder output = new StringBuilder("");
    int t = scanner.nextInt();
    while (t-- != 0) {
      output.append(scanner.next().length());
      if (t != 0) {
        output.append("\n");
      }
    }
    System.out.println(output);
    scanner.close();
  }
}
