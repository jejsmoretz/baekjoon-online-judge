import java.util.Scanner;
 
public class BOJ_5622 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        int[] time = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };
        
        String s = input.nextLine();
        int result = 0;
        
        for( int i = 0; i < s.length(); i++ ) {
            for( int j = 0; j < alphabet.length; j++ ) {
                if( s.charAt(i) == alphabet[j] ) {
                    result += time[j];
                }
            }
        }
        
        System.out.println( result );
        
    }
    
}
