import java.util.Scanner;
 
public class BOJ_1912_2 {
    
    static int min = -2147483648;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int n = input.nextInt();
        
        int[] num = new int[n];
        
        for( int i = 0; i < n; i++ )
            num[i] = input.nextInt();
        
        System.out.println( MaxSum( num ) );
    }
    
    // DP
    public static int MaxSum( int[] num ) {
        int N = num.length, ret = min, sum = 0;
        for( int i = 0; i < N; i++ ) {
            sum = Math.max( sum, 0 ) + num[i];
            ret = Math.max( sum, ret );
        }
        return ret;
    }
    
}
