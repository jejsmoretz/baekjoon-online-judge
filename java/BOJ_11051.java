import java.util.Scanner;
 
public class BOJ_11051 {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        int K = input.nextInt();
        
        int[][] BC = new int[1001][1001];
        
        for( int i = 0; i <= N; i++ ) {
            for( int j = 0; j <= i; j++ ) {
                if( i == j || j == 0)
                    BC[i][j] = 1;
                else
                    BC[i][j] = BC[ i - 1 ][ j - 1 ] + BC[ i - 1 ][j];
                BC[i][j] %= 10007;
            }
        }
        System.out.println( BC[N][K] );
    }
        
}
