import java.util.Scanner;
 
public class BOJ_9660 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        long N = input.nextLong();
        
        if( N % 7 == 0 || N % 7 == 2 )
            System.out.println( "CY" );
        else
            System.out.println( "SK" );
        
    }
    
}
