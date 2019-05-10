import java.util.Scanner;
 
public class BOJ_5988 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        
        for( int i = 0; i < N; i++ ) {
            String num = input.next();
            if( Integer.parseInt( String.valueOf( num.charAt( num.length() - 1 ) ) ) % 2 == 0 )
                System.out.println( "even" );
            else
                System.out.println( "odd" );
        }
    }
    
}
