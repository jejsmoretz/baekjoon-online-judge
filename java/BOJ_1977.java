import java.util.*;
 
public class BOJ_1977 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int M = input.nextInt();
        int N = input.nextInt();
        int sum = 0;
        int min = N;
        
        for( int i = M; i <= N; i++ ) {
            if( PSN(i) ) {
                sum += i;
                if( min > i && i != 0 )
                    min = i;
            }
        }
        
        if( sum == 0 )
            System.out.print( -1 );
        else
            System.out.print( sum + "\n" + min );
        
    }
 
    // 완전제곱수 계산
    public static boolean PSN( int x ) {
        boolean result = false;
        for( int i = 0; i <= x; i++ ) {
            if( x == i * i )
                result = true;
        }
        return result;
    }
    
}
