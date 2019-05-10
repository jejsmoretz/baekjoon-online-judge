import java.util.Scanner;
 
public class BOJ_1075 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int N = ( input.nextInt() / 100 ) * 100;
        int F = input.nextInt();
        
        if( N % F == 0 )
            System.out.printf( "%02d", 0 );
        else
            System.out.printf( "%02d", ( ( ( N / F ) + 1 ) * F ) - N );
    }
    
}
