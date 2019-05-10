import java.util.Arrays;
import java.util.Scanner;
 
public class BOJ_4153 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int[] tri = new int[3];
        
        while( true ) {
            for( int i = 0; i < 3; i++ )
                tri[i] = input.nextInt();
            
            Arrays.sort( tri );
            
            if( tri[0] == 0 && tri[1] == 0 && tri[2] == 0 ) {
                break;
            } else {
                if( ( tri[0] * tri[0] ) + ( tri[1] * tri[1] ) == tri[2] * tri[2] )
                    System.out.println( "right" );
                else
                    System.out.println( "wrong" );
            }
        }
        
    }
    
}
