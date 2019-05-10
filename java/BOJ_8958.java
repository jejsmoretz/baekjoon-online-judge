import java.util.Scanner;
 
public class BOJ_8958 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int T = input.nextInt();
        int[] sum = new int[T];
        
        for( int i = 0; i < T; i++ ) {
            String OX = input.next();
            int[] score = new int[OX.length()];
            
            for( int j = 0; j < OX.length(); j++ ) {
                if( j == 0 ) {
                    if( OX.charAt(j) == 'O' ) {
                        score[j] = 1;
                    }
                } else {
                    if( OX.charAt(j) == 'O' ) {
                        if( OX.charAt(j - 1) == 'O' )
                            score[j] = score[j - 1] + 1;
                        else
                            score[j] = 1;
                    }
                }
            }
            
            for( int j = 0; j < OX.length(); j++ ) {
                sum[i] += score[j];
            }
            
        }
        
        for( int i = 0; i < T; i++ ) {
            System.out.println(sum[i]);
        }
        
    }
    
}
