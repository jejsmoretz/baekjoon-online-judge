import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
 
public class BOJ_11721 {
 
    public static void main(String[] args) {
        
        String s;
        
        try {
            BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
            PrintWriter out = new PrintWriter( new OutputStreamWriter( System.out ) );
            
            s = String.valueOf( in.readLine() );
            
            for( int i = 0; i < s.length(); i++) {
                if( i % 10 == 0 && i != 0 ) {
                    out.println();
                }
                out.print( s.charAt(i) );
            }
            out.flush();
        } catch(IOException e) {
            e.getMessage();
        }
        
    }
 
}
