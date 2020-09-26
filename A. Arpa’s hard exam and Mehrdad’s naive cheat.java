/**
 *  @author WasitShafi
 *  @since 18-SEP-2020
 */
// https://codeforces.com/problemset/problem/742/A
import java.util.Scanner;

public class Solution
{
  public static void main(String[] args)
  {
    int n;
    int ans = -1;
    Scanner scanner = new Scanner(System.in);
    // Find last digit of 1378^n
    /* Hamid's Logic
     * if n == 0 return 1
     * else 
     * we know if 8 ^ 1 = 8 last digit = 8
     * we know if 8 ^ 2 = 64 last digit = 4
     * we know if 8 ^ 3 = 512 last digit = 2
     * we know if 8 ^ 4 = 4096 last digit = 6
     * After that it will repeat this cycle n > 4
     */
  
    n = scanner.nextInt();
    if (n == 0) {
      ans = 1;
    } else {
      n = n % 4;
      switch (n) {
      case 1:
        ans = 8;
        break;
      case 2:
        ans = 4;
        break;
      case 3:
        ans = 2;
        break;
      case 0:
        ans = 6;
        break;
      }
    }
    System.out.print(ans);
    scanner.close();
  }
}