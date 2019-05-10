import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class BOJ_1259 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
        
        while( true ) {
            String T = input.readLine();
            if( T.equals( "0" ) )
                break;
            StringBuffer sb = new StringBuffer( T );
            sb = sb.reverse();
            String reverseT = sb.toString();
            if( T.equals( reverseT )  )
                System.out.println( "yes" );
            else
                System.out.println( "no" );
        }
    }
    
}
