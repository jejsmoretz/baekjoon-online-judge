import java.util.Scanner;
 
public class BOJ_2089 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int nb = input.nextInt();
        
        if( nb == 0 )
            System.out.print( "0" );
        else
            negativeBinary( nb );
 
    }
    
    public static void negativeBinary( int nb ) {
        if( nb == 0 ) {
            return;
        }
        if( nb % -2 == 0 ) {
            negativeBinary( nb / -2 );
            System.out.print( "0" );
        } else {
            if( nb > 0) {
                negativeBinary( nb / -2 );
                System.out.print( "1" );
            } else {
                negativeBinary( (nb - 1) / -2 );
                System.out.print( "1" );
            }
        }
    }
    
}
