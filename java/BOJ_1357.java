import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class BOJ_1357 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
        StringTokenizer st = new StringTokenizer( input.readLine() );
        
        String X = st.nextToken();
        String Y = st.nextToken();
        
        StringBuffer reverse;
        
        reverse = new StringBuffer( X );
        reverse = reverse.reverse();
        String reverseX = reverse.toString();
        
        reverse = new StringBuffer( Y );
        reverse = reverse.reverse();
        String reverseY = reverse.toString();
        
        String result = String.valueOf( Integer.parseInt( reverseX ) + Integer.parseInt( reverseY ) );
        
        reverse = new StringBuffer( result );
        reverse = reverse.reverse();
        
        System.out.println( Integer.parseInt( reverse.toString() ) );
    }
    
}
