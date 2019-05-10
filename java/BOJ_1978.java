import java.util.*;
 
public class BOJ_1978 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        int[] d = new int[N];
        int result = 0;
        
        for( int i = 0; i < d.length; i++ ) {
            d[i] = input.nextInt();
        }
        
        for( int i = 0; i < d.length; i++ ) {
            int count = 0;
            for( int k = 1; k <= d[i]; k++ ) {
                if( d[i] % k == 0 )
                    count++;
            }
            if( count == 2 ) {
                result++;
            }
        }
        
        System.out.println( result );
        
    }
 
}
