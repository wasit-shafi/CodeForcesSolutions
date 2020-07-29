//https://codeforces.com/problemset/problem/71/A
import java.util.Scanner;

public class WayTooLongWords
{
    public static void main(String[] args)
    {
        String s = "";
        Scanner scanner = new Scanner(System.in);
        int len, n = scanner.nextInt();

        scanner.nextLine();
        while(n-- != 0)
        {
            s = scanner.next();
            len = s.length();
            if(len <=10)
                System.out.println(s);
            else
                System.out.println(s.charAt(0) + Integer.toString(len - 2) + s.charAt(len-1));
        }
    }
}