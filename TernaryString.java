/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */
// https://codeforces.com/problemset/problem/1354/B
import java.util.*;

public class TernaryString {
  public static int getMin(int x, int y) {
    return x < y ? x : y;
  }
  
  public static int getMinLength(String s) {
    int one = -1;
    int two = -1;
    int three = -1;
    int tempLength;
    int length = s.length();
    int minLength = Integer.MAX_VALUE;
    
    for(int i = 0; i < length; i++) {
      switch (s.charAt(i)) {
        case '1':
          one = i;
          break;
        case '2':
          two = i;
          break;
        case '3':
          three = i;
          break;
      }

      if (one != -1 && two != -1 && three != -1) {
          tempLength = i - getMin(one, getMin(two, three)) + 1;
        if (tempLength < minLength) {
          minLength = tempLength;
        }
      }
    }
    return minLength == Integer.MAX_VALUE ? 0 : minLength;
  }

  public static void main(String[] args) {
    int n;
    StringBuilder output = new StringBuilder("");
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    scanner.nextLine();
    while (n-- != 0) {
      output.append("" + getMinLength(scanner.next()));
      if(n != 0) {
        output.append("\n");
      }
    }

    System.out.println(output);
    scanner.close();
  }
}