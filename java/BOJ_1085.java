import java.util.Scanner;
 
public class BOJ_1085 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int x = input.nextInt();
        int y = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();
        
        int[] distance = new int[4];
        distance[0] = x - 0;
        distance[1] = y - 0;
        distance[2] = w - x;
        distance[3] = h - y;
        
        int result;
        if( w > h )
            result = w;
        else
            result = h;
            
        for( int i = 0; i < 4; i++ ) {
            if( distance[i] < result )
                result = distance[i];
        }
        System.out.println( result );
    }
    
}
