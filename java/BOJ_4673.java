import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_4673 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for( int i = 1; i <= 10000; i++ ) {
            list.add( selfNumber(i) );
        }
        
        for( int i = 1; i <= 10000; i++ ) {
            if( !list.contains(i) ) {
                System.out.println(i);
            }
        }
        
    }
    
    // 셀프넘버
    public static int selfNumber(int n) {
        
        int dn = 0;
        
        dn += n;
        
        for ( int i = n; i > 0; i /= 10 ) {
            dn += i % 10;
        }
        
        return dn;
        
    }
    
}
