import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_2981 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
 
        int N = input.nextInt();
        int sub = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for( int i = 0; i < N; i++ ) {
            int num = input.nextInt();
            if( sub == 0 )
                sub = num;
            else {
                if( num - sub > 0 ) {
                    list.add( num - sub );
                    sub = num;
                } else {
                    list.add( sub - num );
                    sub = num;
                }
            }
        }
        
        int result = list.get(0);
        
        if( list.size() > 1 ) {
            result = list.get(0);
            for( int i = 1; i < list.size(); i++ )
                result = GCD(result, list.get(i) );
        }
        
        for( int i = 2; i <= result / 2; i++ ) {
            if( result % i == 0 )
                System.out.print( i + " " );
        }
        System.out.print(result);
    }
    
    // 최대공약수 계산
    public static int GCD( int a, int b ) {
        
        if( b == 0 )
            return a;
        else
            return GCD(b, a % b );
    }
    
}
