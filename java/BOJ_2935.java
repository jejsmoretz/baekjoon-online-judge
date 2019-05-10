import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
public class BOJ_2935 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
        
        BigInteger num1 = new BigInteger( input.readLine() );
        String operator = input.readLine();
        BigInteger num2 = new BigInteger( input.readLine() );
        
        if( operator.equals( "*" ) ) {
            System.out.println( num1.multiply( num2 ) );
        } else if( operator.equals( "+" ) ) {
            System.out.println( num1.add( num2 ) );
        }
    }
}
