import java.util.Scanner;
 
public class BOJ_1912 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int n = input.nextInt();
        
        int[] sum = new int[n];
        
        int result = 0;
        for( int i = 0; i < n; i++ ) {
            int num = input.nextInt();
            if( i == 0 ) {
                sum[i] = num;
                result = num;
            } else {
                if( num < sum[ i - 1 ] + num )
                    sum[i] = sum[ i - 1 ] + num;
                else
                    sum[i] = num;
            }
            result = Math.max( result, sum[i] );
        }
        System.out.println( result );
    }
    
}
