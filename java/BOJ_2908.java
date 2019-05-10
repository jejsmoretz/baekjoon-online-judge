import java.util.Scanner;
 
public class BOJ_2908 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int[] AB = new int[2];
        
        for( int i = 0; i < 2; i++ ) {
            int x = input.nextInt();
            
            AB[i] = ( ( x % 10 ) * 100 )
                + ( ( ( x / 10 ) % 10 ) * 10 )
                + ( x / 100 );
        }
        
        if( AB[0] > AB[1] )
            System.out.println( AB[0] );
        else
            System.out.println( AB[1] );
    }
    
}
