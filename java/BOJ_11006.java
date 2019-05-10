import java.util.Scanner;
 
public class BOJ_11006 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int T = input.nextInt();
       
        for( int i = 0; i < T; i++ ) {
            int N = input.nextInt();
            int M = input.nextInt();
            
            System.out.println( ( ( M * 2 ) - N ) + " " + ( M - ( ( M * 2 ) - N ) ) );
        }
        
    }
    
}