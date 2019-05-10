import java.util.Scanner;
 
public class BOJ_2675 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int T = input.nextInt();
        
        String[] R = new String[T];
        String[] S = new String[T];
        String[] P = new String[T];
        
        for( int i = 0; i < T; i++ ) {
            R[i] = input.next();
            S[i] = input.next();
            
        }
        
        for( int i = 0; i < T; i++ ) {
            for( int j = 0; j < S[i].length(); j++ ) {
                for( int k = 0; k < Integer.parseInt( R[i] ); k++ ) {
                    System.out.print( S[i].charAt(j) );
                }
            }
            System.out.println();
        }
        
        
    }
    
}
