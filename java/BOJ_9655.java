import java.util.Scanner;
 
public class BOJ_9655 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        
        if( N % 2 == 0 )
            System.out.println( "CY" );
        else
            System.out.println( "SK" );
        
    }
    
}
