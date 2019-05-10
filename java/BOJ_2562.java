import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class BOJ_2562 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        Map< Integer, Integer > map = new HashMap< Integer, Integer >();
        
        int max = 0;
        for( int i = 0; i < 9; i++ ) {
            int num = input.nextInt();
            if( num > max )
                max = num;
            map.put( num, i + 1 );
        }
        System.out.println( max + "\n" + map.get( max ) );
    }
    
}
