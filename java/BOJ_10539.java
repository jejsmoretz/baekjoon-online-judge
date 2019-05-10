import java.util.Scanner;
 
public class BOJ_10539 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int n = input.nextInt();
        
        int[] B = new int[n];
        int[] A = new int[n];
        
        for( int i = 0; i < n; i++ )
            B[i] = input.nextInt();
        
        int sum = 0;
        for( int i = 0; i < n; i++ ) {
            if( i == 0 )
                A[i] = B[i];
            else {
                A[i] = ( B[i] * ( i + 1 ) ) - sum;
            }
            sum += A[i];
        }
        
        for( int i = 0; i < n; i++ )
            System.out.print( A[i] + " " );
        
    }
    
}
