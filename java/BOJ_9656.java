import java.util.Scanner;
 
public class BOJ_9656 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        
        if( N % 2 == 0 )
            System.out.println( "SK" );
        else
            System.out.println( "CY" );
        
    }
    
}
