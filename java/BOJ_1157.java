import java.util.Scanner;
 
public class BOJ_1157 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
 
        String s = input.nextLine();
        
        int[] alphabet = new int[26];
        int n = 0;
        char result = ' ';
        
        for( int i = 0; i < s.length() ; i++ ) {
            if( s.charAt(i) - 65 > 31 )
                alphabet[ s.charAt(i) - 97 ]++;
            else
                alphabet[ s.charAt(i) - 65 ]++;
        }
        
        for( int i = 0; i < alphabet.length; i++ ) {
            if( alphabet[i] > n ) {
                n = alphabet[i];
                result = ( char )(i + 65);
            }
        }
        
        for( int i = 0; i < alphabet.length; i++ ) {
            if( i != result - 65 && alphabet[i] == n ) {
                result = '?';
                break;
            }
        }
        
        System.out.println( result );
 
    }
    
}
