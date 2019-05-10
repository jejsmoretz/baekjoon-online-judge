import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class BOJ_15552 {
 
    public static void main(String[] args) {
        
        int T;
        int A;
        int B;
        
        try {
            BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
            PrintWriter out = new PrintWriter( new OutputStreamWriter( System.out ) );
            
            T = Integer.parseInt( in.readLine() );
            
            for( int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer( in.readLine() );
                A = Integer.parseInt( st.nextToken() );
                B = Integer.parseInt( st.nextToken() );
                
                out.println(A + B);
            }
            out.flush();
        } catch(IOException e) {
            e.getMessage();
        }
        
    }
 
}
