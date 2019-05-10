import java.util.Scanner;
 
public class BOJ_9661 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        long N = input.nextLong();
        
        if( N % 5 == 0 || N % 5 == 2 )
            System.out.println( "CY" );
        else
            System.out.println( "SK" );
    }
    
}
