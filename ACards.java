/**
 *  @author WasitShafi
 *  @since 18-SEP-2020
 */
// https://codeforces.com/problemset/problem/1220/A

import java.util.Scanner;

public class ACards
{
  public static int getMin(int x, int y) {
    return x < y ? x : y;
  }

  public static void main(String[] args)
  {
    int n;
    int zCount = 0;
    int eCount = 0;
    int rCount = 0;
    int oCount = 0;
    int nCount = 0;
    String str;
    int oneCount;
    int zeroCount;
    StringBuilder output = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    scanner.nextLine();
    str = scanner.next();

    for (int i = 0 ; i < n ; i++) {
      switch (str.charAt(i)) {
        case 'z':
          zCount++;
          break;
        case 'e':
          eCount++;
          break;
        case 'r':
          rCount++;
          break;
        case 'o':
          oCount++;
          break;
        case 'n':
          nCount++;
          break;
    }
  }
  oneCount = getMin(oCount, getMin(nCount, eCount));
  oCount -= oneCount;
  nCount -= oneCount;
  eCount -= oneCount;
  zeroCount = getMin(zCount, getMin(eCount, getMin(rCount, oCount)));

  for (int i = 0; i < oneCount; i++) {
    output.append("1");
    if (i + 1 != oneCount) {
      output.append(" ");
    }
  }
  if(zeroCount > 0 && oneCount != 0) {
    output.append(" ");
  }
  for (int i = 0; i < zeroCount; i++) {
    output.append("0");
    if (i + 1 != zeroCount) {
      output.append(" ");
    }
  }

  System.out.print(output);
  scanner.close();
  }
}