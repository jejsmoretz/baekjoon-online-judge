import java.util.Scanner;
 
public class BOJ_9659 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        long N = input.nextLong();
        
        if( N % 2 == 0 )
            System.out.println( "SK" );
        else
            System.out.println( "CY" );
    }
    
}
