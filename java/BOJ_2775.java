import java.util.Scanner;
 
public class BOJ_2775 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int T = input.nextInt();
 
        for( int i = 0; i < T; i++ ) {
            int k = input.nextInt();
            int n = input.nextInt();
            
            System.out.println( apartment( k, n ) );
        }
        
    }
    
    // k층 n호의 인원 수 계산
    public static int apartment( int k, int n ) {
        int sum = 0;
        
        if( k == 0 )
            sum += n;
        else if(k == 1 ) {
            for( int j = 1; j <= n; j++ )
                sum += j;
        }
        else {
            for( int j = 1; j <= n; j++ ) {
                sum += j * apartment( k - 2, n - j + 1 );
            }
        }
        
        return sum;
        
    }
 
}
