import java.util.Arrays;
import java.util.Scanner;
 
public class BOJ_1037 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int N = input.nextInt();
 
        int[] divisor = new int[N];
        
        
        for( int i = 0; i < N; i++ )
            divisor[i] = input.nextInt();
        
        Arrays.sort( divisor );
        System.out.println( divisor[0] * divisor[ N - 1 ] );
        
    }
    
}
