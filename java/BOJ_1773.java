import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class BOJ_1773 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
       
        int N = input.nextInt();
        int C = input.nextInt();
        
        Set< Integer > firework = new HashSet< Integer >();
        
        for( int i = 0; i < N; i++ ) {
            int cycle = input.nextInt();
            if( !firework.contains( cycle ) ) {
                for( int j = cycle; j <= C; j += cycle )
                    firework.add(j);
            }
        }
        
        System.out.println( firework.size() );
    }
    
}
