import java.util.Scanner;
 
public class BOJ_1476 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int E = input.nextInt();
        int S = input.nextInt();
        int M = input.nextInt();
        
        int e, s, m;
        for( int i = 1; i <= 7980; i++ ) {
            if( i % 15 == 0 )
                e = 15;
            else
                e = i % 15;
            
            if( i % 28 == 0 )
                s = 28;
            else
                s = i % 28;
            
            if( i % 19 == 0 )
                m = 19;
            else
                m = i % 19;
            if( e == E && s == S && m == M ) {
                System.out.println( i );
                break;
            }
        }
    }
    
}
