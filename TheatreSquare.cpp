// https://codeforces.com/problemset/problem/1/A
#include<bits/stdc++.h>
using namespace std;

int main()
{
        int n, m;
        double a;

        cin >> n >> m >> a;
         if(a >= n && a >= m)
            cout << "1";
        else
        {
            long long x = (long)ceil(n / a);
            long long y = (long)ceil(m / a);
            cout << x * y;
        }
}