import java.util.Scanner;
 
public class BOJ_10220 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int T = input.nextInt();
        
        for( int i = 0; i < T; i++ ) {
            int N = input.nextInt();
            if( N == 1 || N == 2 || N == 3 || N == 6 )
                System.out.println( 0 );
            else if( N == 4 )
                System.out.println( 2 );
            else
                System.out.println( 1 );
        }
        
    }
    
}
