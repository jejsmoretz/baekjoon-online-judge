import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class BOJ_15998 {
    public static long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
 
        long res = 0;
        long[] a = new long[300003];
        long[] b = new long[300003];
        for(int i = 1; i <= n; i++) {
            String[] strAb = input.readLine().split(" ");
            a[i] = Long.parseLong(strAb[0]);
            b[i] = Long.parseLong(strAb[1]);
            res = gcd(res, b[i] - b[i - 1] - a[i]);
        }
        long[] M = new long[n+1];
 
        for(int i = 1; i <= n; i++) {
            if(a[i] < 0){
                M[i] = b[i] - b[i - 1] - a[i];
            }
        }
        for(int i = 1; i <= n; i++) {
            if(b[i] - b[i - 1] == a[i]) continue;
            if(res != 0 && res <= b[i] || a[i] > 0 || a[i] < 0 && -a[i] < b[i - 1]) {
                System.out.println("-1");
                return;
            }
        }
        if(res == 0) System.out.println("1");
        else System.out.println(res);
    }
}
