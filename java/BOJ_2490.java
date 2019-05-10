import java.util.*;
 
public class BOJ_2490 {
 
    public static final int F = 0;
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int[][] Y = new int[3][4];
        String[] result = new String[3];
        
        for( int i = 0; i < Y.length; i++ ) {
            for( int k = 0; k < Y[i].length; k++ ) {
                Y[i][k] = input.nextInt();
            }
        }
        
        for( int i = 0; i < Y.length; i++ ) {
            int count = 0;
            
            for( int k = 0; k < Y[i].length; k++ ) {
                if( Y[i][k] == F ) {
                    count++;
                }
            }
            
            switch( count ) {
                case 0:
                    result[i] = "E";
                    break;
                case 1:
                    result[i] = "A";
                    break;
                case 2:
                    result[i] = "B";
                    break;
                case 3:
                    result[i] = "C";
                    break;
                default:
                    result[i] = "D";
                    break;
            }
        }
        
        for( int i = 0; i < result.length; i++ ) {
            System.out.println(result[i]);
        }
        
    }
 
}
