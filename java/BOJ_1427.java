import java.util.Arrays;
import java.util.Scanner;
 
public class BOJ_1427 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        String N = input.nextLine();
        
        int[] numN = new int[ N.length() ];
        
        for( int i = 0; i < N.length(); i++ )
            numN[i] = Integer.parseInt( String.valueOf( N.charAt(i) ) );
        
        Arrays.sort( numN );
        
        for( int i = numN.length - 1; i >= 0; i-- )
            System.out.print( numN[i] );
    }
    
}