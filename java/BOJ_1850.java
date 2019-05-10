import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class BOJ_1850 {
 
    public static void main(String[] args) {
        
        long A;
        long B;
        long gcd;
        
        try {
            BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
            PrintWriter out = new PrintWriter( new OutputStreamWriter( System.out ) );
            StringTokenizer st = new StringTokenizer( in.readLine() );
            A = Long.parseLong( st.nextToken() );
            B = Long.parseLong( st.nextToken() );
            
            while( true ) {
                if( A > B ) {
                    if ( B == 0 ) {
                        for( long i = 0; i < A; i++ ) {
                            out.print(1);
                        }
                        break;
                    } else {
                        gcd = A % B;
                        A = B;
                        B = gcd;
                    }
                } else {
                    if ( A == 0 ) {
                        for( long i = 0; i < B; i++ ) {
                            out.print(1);
                        }
                        break;
                    } else {
                        gcd = B % A;
                        B = A;
                        A = gcd;
                    }
                }
            }
            out.flush();
        } catch(IOException e) {
            e.getMessage();
        }
        
    }
 
}
