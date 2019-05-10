import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_1065 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int N = input.nextInt();
        
        for( int i = 1; i <= N; i++ ) {
            if( hansu(i) != 0)
                list.add( hansu(i) );
        }
        
        System.out.println( list.size() );
        
    }
        
    // 한수
    public static int hansu(int x) {
        
        int X = 0;
        int d = 0;
        
        if( x > 0 && x < 100 )
            X = x;
        else {
            d = ( x % 10 ) - ( ( x / 10 ) % 10 );
            
            for(int i = x; i > 9; i /= 10 ) {
                if( d == ( i % 10 ) - ( ( i / 10 ) % 10 ) )
                    X = x;
                else {
                    X = 0;
                    break;
                }
            }
        }
        
        return X;
    }
    
}
