// https://codeforces.com/problemset/problem/1455/A
/**
 *  @author WasitShafi
 *  @since 03-DEC-2020
 */

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BigInteger t = new BigInteger("0");
    StringBuilder output = new StringBuilder("");

    t = scanner.nextBigInteger();
    while (t.compareTo(BigInteger.valueOf(0)) == 1) {
      output.append(scanner.next().length());
      t = t.subtract(BigInteger.ONE);
      if (t.compareTo(BigInteger.valueOf(0)) == 1) {
        output.append("\n");
      }
    }
    System.out.println(output);
    scanner.close();
  }
}
