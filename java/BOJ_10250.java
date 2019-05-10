import java.util.Scanner;
 
public class BOJ_10250 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int T = input.nextInt();
        
        int[] hotel = new int[T];
        
        for( int i = 0; i < T; i++ ) {
            int h = 100;
            int w = 1;
            int n = 0;
            int H = input.nextInt();
            int W = input.nextInt();
            int N = input.nextInt();
            
            if( N > H ) {
                for( int j = N - H; j > 0; j -= H ) {
                    w++;
                    n = j;
                }
                
                for( int j = 2; j <= n; j++ ) {
                    h += 100;
                }
                
            } else {
                for( int j = 2; j <= N; j++ ) {
                    h += 100;
                }
            }
            
            hotel[i] = h + w;
            
        }
        
        for( int i = 0; i < T; i++ ) {
            System.out.println(hotel[i]);
        }
        
    }
    
}
