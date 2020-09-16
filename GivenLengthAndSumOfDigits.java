/**
 * @author WasitSahfi
 * @since 16-SEP-2020
 */

// Refer : https://codeforces.com/submissions/WasitShafi
// TLE on TEST 5 :)

import java.util.util;

public class GivenLengthAndSumOfDigits {
  public static String toStr(int[] arr) {
      StringBuilder sb = new StringBuilder("");
      int i = 0;
      int length = arr.length;
      while (arr[i++] == 0);
      i--;
      while (i < length) {
        sb.append("" + arr[i++]);
      }
      return sb.toString();
    }

    public static int getDigitsSum(int[] arr, int s) {
      int i = 0;
      int sum = 0;
      int length = arr.length;
      while (arr[i++] == 0);
      i--;
      while (i < length) {
        sum += arr[i++];
        if (sum > s) {
          return -1;
        }
      }
      return sum;
    }

    public static void incArr(int[] arr) {
        int n = 1;
        int carry = 0;
        int i = arr.length - 1;
        do {
            carry = arr[i] + n;
            arr[i--] =carry % 10;
            carry = carry / 10;
        } while (carry != 0);
    }

    public static String getSmallestLargest(int m, int s) {
      if ((m == 1 && s > 9)) {
        return "-1 -1";
      }  else if (m == 1 && s < 10) {
        return  "" + s + " " + s;
      } //else if(m > s && s != 0) {
       // return "-1 -1";
     // }
       else {
        int SIZE = 100;
        int arr[] = new int[SIZE];
        arr[SIZE - m] = 1;
        StringBuilder minSum = new StringBuilder("-1");
        StringBuilder maxSum = new StringBuilder("-1");
        StringBuilder str = new StringBuilder("");

        for(long i = 0; i < (int)(Math.pow(10, m) - Math.pow(10, m-1)) ; i++) {
          if (s == getDigitsSum(arr, s))
          {
            str.setLength(0);
            str.append(toStr(arr));
            if("-1".equals(minSum.toString())) {
              minSum.setLength(0);
              minSum.append(str);
            }
            maxSum.setLength(0);
            maxSum.append(str);
          }
            //System.out.println(("arr : " + toStr(arr) + " i : " + i));
            incArr(arr);

        }
        return minSum.toString() + " " + maxSum.toString();
      }
    }

  public static void main(String[] args) {
    int m;
    int s;
    Scanner scanner = new Scanner(System.in);
    
    m = scanner.nextInt();
    s = scanner.nextInt();
    System.out.println(getSmallestLargest(m, s));
    scanner.close();
  }
}