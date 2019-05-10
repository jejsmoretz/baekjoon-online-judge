import java.util.Arrays;
import java.util.Scanner;
 
public class BOJ_11656 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        String S = input.nextLine();
        String[] suffix = new String[ S.length() ];
        
        for( int i = 0; i < suffix.length; i++ )
            suffix[i] = S.substring( i, S.length() );
        
        Arrays.sort( suffix );
        
        for( int i = 0; i < suffix.length; i++ )
            System.out.println( suffix[i] );
        
    }
    
}
