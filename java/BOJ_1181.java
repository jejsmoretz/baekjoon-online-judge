import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
 
public class BOJ_1181 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = Integer.parseInt( input.nextLine() );
        
        HashMap< String, Integer > word = new HashMap< String, Integer >();
        
        for( int i = 0; i < N; i++ ) {
            word.put( input.nextLine(), 0 );
        }
        
        String[] words = new String[ word.size() ];
        
        int z = 0;
        for( String w : word.keySet() ) {
            words[z] = w;
            z++;
        }
        
        Arrays.sort( words );
        Arrays.sort( words, ( word1, word2 ) -> Integer.compare( word1.length(), word2.length() ) );
            
        for( int i = 0; i < words.length; i++ )
            System.out.println( words[i] );
    }
    
}
