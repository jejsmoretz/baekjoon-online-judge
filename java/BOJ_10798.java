import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_10798 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        ArrayList< String > s = new ArrayList< String >();
        
        for( int i = 0; i < 5; i++ ) {
            s.add( input.nextLine() );
        }
        
        for( int i = 0; i < 15; i++ ) {
            for( int j = 0; j < 5; j++ ) {
                if( i < s.get(j).length() )
                    System.out.print( s.get(j).charAt(i) );
            }
        }
    }
    
}
