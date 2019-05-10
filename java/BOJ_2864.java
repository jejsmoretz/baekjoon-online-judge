import java.util.Scanner;
 
public class BOJ_2864 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        String A = input.next();
        String B = input.next();
        
        A = A.replace( '6', '5' );
        B = B.replace( '6', '5' );
        System.out.println( Integer.parseInt( A ) + Integer.parseInt( B ) );
        A = A.replace( '5', '6' );
        B = B.replace( '5', '6' );
        System.out.println( Integer.parseInt( A ) + Integer.parseInt( B ) );
    }
    
}