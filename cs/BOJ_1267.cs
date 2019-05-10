using System;
 
class Program
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine()), n1 = 0, n2 = 0;
        string[] num = Console.ReadLine().Split(" ");
        for(int i = 0; i < n; i++)
        {
            n1 += (int.Parse(num[i]) / 30 + 1) * 10;
            n2 += (int.Parse(num[i]) / 60 + 1) * 15;
        }
        if(n1 > n2) Console.WriteLine("M " + n2);
        else if(n1 < n2) Console.WriteLine("Y " + n1);
        else Console.WriteLine("Y M " + n1);
    }
}