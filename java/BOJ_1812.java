import java.util.Scanner;
 
public class BOJ_1812 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        
        int[] candySum = new int[ N + 1 ];
        int[] candy = new int[N];
        
        for( int i = 0; i < N; i++ ) {
            candySum[i] = input.nextInt();
            candySum[N] += candySum[i];
        }
        
        int sum = 0;
        for( int i = 1; i < N; i += 2 ) {
            sum += candySum[i];
        }
        
        for( int i = 0; i < N; i++ ) {
            if( i == 0 )
                candy[i] = ( candySum[N] / 2 ) - sum;
            else
                candy[i] = candySum[ i - 1 ] - candy[ i - 1 ]; 
            System.out.println( candy[i] );
        }
        
    }
    
}
