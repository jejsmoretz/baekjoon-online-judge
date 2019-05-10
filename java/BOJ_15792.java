import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;
 
public class BOJ_15792 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
        StringTokenizer st = new StringTokenizer( input.readLine() );
        
        BigDecimal A = new BigDecimal( st.nextToken() );
        BigDecimal B = new BigDecimal( st.nextToken() );
        
        System.out.print( A.divide( B, 1000, BigDecimal.ROUND_HALF_UP ) );
        
    }
    
}