import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class BOJ_5533 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        Map< Integer, Integer > map = new HashMap< Integer, Integer >();
        int N = input.nextInt();
        int[][] people = new int[N][4];
        
        for( int i = 0; i < N; i++ ) {
            for( int j = 0; j < 3; j++ )
                people[i][j] = input.nextInt();
        }
        
        for( int i = 0; i < 3; i++ ) {
            for( int j = 0; j < N; j++ ) {
                if( map.containsKey( people[j][i] ) )
                    map.put( people[j][i], 1);
                else
                    map.put( people[j][i], 0);
            }
            
            for( int j = 0; j < N; j++ ) {
                if( map.get( people[j][i] ) == 0 )
                    people[j][3] += people[j][i];
            }
            map.clear();
        }
        
        for( int i = 0; i < N; i++ ) {
            System.out.println( people[i][3] );
        }
    }
    
}
