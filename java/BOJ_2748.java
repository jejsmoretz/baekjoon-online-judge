import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_2748 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        ArrayList< String > fibonacci = new ArrayList< String >();
        
        int n = input.nextInt();
        
        fibonacci.add("0");
        fibonacci.add("1");
                
        for( int i = 2; i <= n; i++ ) 
            fibonacci.add( String.valueOf( Long.parseLong( fibonacci.get( i - 2 ) ) + Long.parseLong( fibonacci.get( i - 1 ) ) ) );
        
        System.out.println( String.valueOf( fibonacci.get(n) ) );
    }
    
}
