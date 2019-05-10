import java.util.*;
 
public class BOJ_2581 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int M = input.nextInt();
        int N = input.nextInt();
        int num = 0;
        int sum = 0;
        int min = 0;
        int[] numbers = new int[N - M + 1];
        
        for( int i = M; i <= N; i++ ) {
            int count = 0;
            for( int k = 1; k <= i; k++ ) {
                if( i % k == 0 )
                    count++;
            }
            if( count == 2 ) {
                numbers[num] = i;
                min = i;
            }
            num++;
        }
        
        for( int i = 0; i < N - M + 1; i++ ) {
            sum += numbers[i];
        }
        
        if( sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            
            for( int i = 0; i < N - M + 1; i++ ) {
                if( numbers[i] != 0 ) {
                    if( min > numbers[i] ) {
                        min = numbers[i];
                    }
                }
            }
            System.out.println(min);
        }
        
    }
 
}