import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_2747 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        ArrayList< Integer > fibonacci = new ArrayList< Integer >();
        
        int n = input.nextInt();
        
        fibonacci.add(0);
        fibonacci.add(1);
                
        for( int i = 2; i <= n; i++ ) 
            fibonacci.add( fibonacci.get( i - 2 ) + fibonacci.get( i - 1 ) );
        
        System.out.println( fibonacci.get(n) );
    }
    
}
