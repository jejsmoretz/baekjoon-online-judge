import java.util.Scanner;
 
public class BOJ_1964 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        
        long point = 5;
        long x = 7;
        for( int i = 0; i < N; i++ ) {
            if( i != 0 ) {
                point += x;
                x += 3;
            }
        }
        System.out.println( point % 45678 );
    }
    
}