import java.util.Scanner;
 
public class BOJ_1748 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        
        int result = 0;
        for( int i = 1; i <= N; i *= 10 )
            result += N - i + 1;
        System.out.println( result );
        
    }
}
