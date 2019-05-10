import java.util.Scanner;
 
public class BOJ_9550 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int T = input.nextInt();
       
        for( int i = 0; i < T; i++ ) {
            int N = input.nextInt();
            int K = input.nextInt();
            int sum = 0;
            for( int j = 0; j < N; j++ ) {
                sum += ( input.nextInt() / K );
            }
            System.out.println( sum );
        }
        
    }
    
}