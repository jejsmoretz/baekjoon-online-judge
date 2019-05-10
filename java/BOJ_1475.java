import java.util.Scanner;
 
public class BOJ_1475 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        String N = input.nextLine();
 
        int[] count = new int[10];
        int set = 0;
        int num = 0;
        
        for( int i = 0; i < N.length(); i++ ) {
            count[N.charAt(i) - '0'] += 1;
        }
        
        for( int i = 0; i < 10; i++ ) {
            if( count[i] > num ) {
                num = count[i];
                set = i;
            }
        }
        
        if( set == 6 || set == 9 ) {
            if( ( count[6] + count[9] ) % 2 == 0 )
                set = ( count[6] + count[9] ) / 2;
            else
                set = ( ( count[6] + count[9] ) / 2 ) + 1;
        } else {
            set = count[set];
        }
        
        System.out.println(set);
        
    }
    
}
