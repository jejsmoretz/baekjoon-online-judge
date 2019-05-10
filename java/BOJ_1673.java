import java.util.Scanner;
 
public class BOJ_1673 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        while( input.hasNext() ) {
            int n = input.nextInt();
            int k = input.nextInt();
            
            System.out.println( coupon( 0, n, k ) );
        }
    }
    
    // 쿠폰 계산
    public static int coupon( int result, int n, int k ) {
        if( n / k == 0 )
            return result + ( n % k );
        else
            return coupon( result + ( k * ( n / k ) ), ( n % k ) + ( n / k ), k );
    }
    
}
