import java.util.*;
 
public class BOJ_3036 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        
        int[][] ring = new int[N][2];
        
        for( int i = 0; i < ring.length; i++ ) {
            ring[i][0] = input.nextInt();
        }
        
        for( int i = 1; i < ring.length; i++ ) {
            int A = ring[0][0];
            int B = ring[i][0];
            int gcd;
            while( true ) {
                if( A > B ) {
                    if ( B == 0 ) {
                        ring[i][1] = A;
                        break;
                    } else {
                        gcd = A % B;
                        A = B;
                        B = gcd;
                    }
                } else {
                    if ( A == 0 ) {
                        ring[i][1] = B;
                        break;
                    } else {
                        gcd = B % A;
                        B = A;
                        A = gcd;
                    }
                }
            }
        }
        
        for( int i = 1; i < ring.length; i++ ) {
            System.out.println( (ring[0][0] / ring[i][1]) + "/" + (ring[i][0] / ring[i][1]) );
        }
        
    }
 
}
