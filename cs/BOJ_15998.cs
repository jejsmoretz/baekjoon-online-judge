using System;
 
class Program
{
    static long gcd(long a, long b) => b == 0 ? a : gcd(b, a % b);
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
 
        long res = 0;
        long[] a = new long[300003];
        long[] b = new long[300003];
        for(int i = 1; i <= n; i++)
        {
            string[] strAb = Console.ReadLine().Split(" ");
            a[i] = long.Parse(strAb[0]);
            b[i] = long.Parse(strAb[1]);
            res = gcd(res, b[i] - b[i - 1] - a[i]);
        }
        long[] m = new long[n + 1];
 
        for(int i = 1; i <= n; i++) { if(a[i] < 0) { m[i] = b[i] - b[i - 1] - a[i]; } }
        for(int i = 1; i <= n; i++)
        {
            if(b[i] - b[i - 1] == a[i]) continue;
            if(res != 0 && res <= b[i] || a[i] > 0 || a[i] < 0 && -a[i] < b[i - 1])
            {
                Console.WriteLine("-1");
                return;
            }
        }
        if(res == 0) Console.WriteLine("1");
        else Console.WriteLine(res);
    }
}
