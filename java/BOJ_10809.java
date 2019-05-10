import java.util.Scanner;
 
public class BOJ_10809 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        String S = input.nextLine();
        
        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int[] locate = new int[ alphabet.length ];
        
        for( int i = 0; i < locate.length; i++ )
            locate[i] = -1;
        
        for( int i = 0; i < alphabet.length; i++ ) {
            int count = -1;
            for( int j = 0; j < S.length(); j++ ) {
                if( alphabet[i] != S.charAt(j) )
                    count++;
                else {
                    if( locate[i] == -1) {
                        count++;
                        locate[i] = count;
                    }
                }
            }
        }
        
        for( int i = 0; i < alphabet.length; i++ )
            System.out.print( locate[i] + " " );
        
    }
    
}
