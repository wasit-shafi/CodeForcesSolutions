/**
 *  @author WasitShafi
 *  @since 17-SEP-2020
 */
// https://codeforces.com/problemset/problem/490/A

import java.util.Scanner;
import java.util.ArrayList;

public class TeamOlympiad
{
  public static int getMin(int x, int y) {
    return x < y ? x : y;
  }
  public static String formingTeams(int[] arr, int n) {
    int minSize;
    StringBuilder output = new StringBuilder("");
    ArrayList<Integer> oneIndex = new ArrayList<>();
    ArrayList<Integer> twoIndex = new ArrayList<>();
    ArrayList<Integer> threeIndex = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        oneIndex.add(i + 1);
      } else if (arr[i] == 2) {
        twoIndex.add(i + 1);
      } else {
        threeIndex.add(i + 1);
      }
    }
    minSize = getMin(oneIndex.size(), getMin(twoIndex.size(), threeIndex.size()));

    output.append("" + minSize);
    if (minSize != 0) {
      output.append("\n");
      for (int i = 0; i < minSize ; i++) {
        output.append(oneIndex.get(i) + " " + twoIndex.get(i) + " " + threeIndex.get(i));
        if(i + 1 != minSize) {
          output.append("\n");
        }
      }
    }

    return output.toString();
  }
  public static void main(String[] args)
  {
    int n;
    int[] arr;
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.print(formingTeams(arr, n));
    scanner.close();
  }
}