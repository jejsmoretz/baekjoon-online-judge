import java.util.Scanner;
 
public class BOJ_1316 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
 
        int N = input.nextInt();
        String[][] word = new String[N][2];
        
        for( int i = 0; i < N; i++ ) {
            word[i][1] = "O";
        }
        
        int[] alphabet = new int[26];
        
        for( int i = 0; i < N; i++ ) {
            word[i][0] = input.next();
            
            for( int j = 0; j < word[i][0].length(); j++ ) {
                if( alphabet[ word[i][0].charAt(j) - 'a' ] == 0 )
                    alphabet[ word[i][0].charAt(j) - 'a' ]++;
                else
                    if( j != 0 )
                        if( word[i][0].charAt(j) != word[i][0].charAt( j - 1 ) )
                            word[i][1] = "X";
            }
            
            for( int a = 0; a < alphabet.length; a++ )
                alphabet[a] = 0;
        }
        
        int count = 0;
        
        for(int i = 0; i < N; i++ ) {
            if( word[i][1].equals( "O" ) )
                count++;
        }
        
        System.out.println( count );
        
    }
    
}
