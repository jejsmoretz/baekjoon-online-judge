import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_4504 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        ArrayList<String> list = new ArrayList<String>();
        
        int n = input.nextInt();
        
        while( true ) {
            int x = input.nextInt();
            
            if( x == 0)
                break;
            else {
                if( x % n == 0 )
                    list.add(x + " is a multiple of " + n + ".");
                else
                    list.add(x + " is NOT a multiple of " + n + ".");
            }
        }
        
        for( int i = 0; i < list.size(); i++ ) {
            System.out.println( list.get(i) );
        }
        
    }
    
}
