import java.util.Arrays;
import java.util.Scanner;
 
public class BOJ_2309 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int[] dwarf = new int[9];
        boolean[] check = new boolean[9];
        
        int sum = 0;
        for( int i = 0; i < 9; i++ ) {
            dwarf[i] = input.nextInt();
            sum += dwarf[i];
        }
        
        Arrays.sort( dwarf );
        
        for( int i = 0; i < 9; i++ ) {
            if( i != 0 && check[ i - 1 ] == true )
                break;
            else {
                for( int j = i + 1; j < 9; j++ ) {
                    if( sum - 100 == dwarf[i] + dwarf[j] ) {
                        check[i] = true;
                        check[j] = true;
                        break;
                    }
                }
            }
        }
        
        System.out.println();
        
        for( int i = 0; i < 9; i++ ) {
            if( check[i] == false )
                System.out.println( dwarf[i] );
        }
        
    }
    
}
