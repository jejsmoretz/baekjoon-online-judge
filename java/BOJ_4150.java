import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_4150 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        ArrayList< BigInteger > fibonacci = new ArrayList< BigInteger >();
        
        int n = input.nextInt();
        
        fibonacci.add( BigInteger.ZERO );
        fibonacci.add( BigInteger.ONE );
        fibonacci.add( BigInteger.ONE );
                
        for( int i = 3; i <= n; i++ ) 
            fibonacci.add(  fibonacci.get( i - 1 ).add( fibonacci.get( i - 2 ) ) );
        
        System.out.println( fibonacci.get(n) );
    }
    
}
