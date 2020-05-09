/**
 * URL : https://codeforces.com/problemset/problem/1351/B
 * @author wasitshafi
 * @since 09-05-2020
 */
import java.util.Scanner;
 
public class Squares1351
{
    public static void main(String args[])
    {
        int tc, x, y, p, q;
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
 
        tc = scan.nextInt();
        while(tc-- != 0)
        {
            x = scan.nextInt();
            y = scan.nextInt();
            p = scan.nextInt();
            q = scan.nextInt();
 
            if(x < y)
            {
                x = x + y;
                y = x - y;
                x = x - y;
            }
            if(p < q)
            {
                p = p + q;
                q = p - q;
                p = p - q;
            }
            if(x == p && x == y + q)
                output.append("YES\n");
            else
                output.append("NO\n");
        }
        System.out.println(output);
        scan.close();
    }
}