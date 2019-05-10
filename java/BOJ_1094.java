import java.util.Scanner;
 
public class BOJ_1094 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int[] stick = { 64, 32, 16, 8, 4, 2, 1 };
        
        int X = input.nextInt();
        
        int count = 1;
        for( int i = 0; i < stick.length; i++ ) {
            if( X == stick[i] )
                break;
            else if( X > stick[i] ) {
                X -= stick[i];
                count++;
            }
        }
        System.out.println( count );
    }
    
}
