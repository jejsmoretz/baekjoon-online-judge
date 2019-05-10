import java.util.Scanner;
 
public class BOJ_1547 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int M = input.nextInt();
        
        int[] cup = { 9999, 1, 0, 0 };    // 배열 크기를 1 증가시켜 컵 번호와 매칭시킴
        
        for( int i = 0; i < M; i++ ) {
            int X = input.nextInt();
            int Y = input.nextInt();
            int Z = cup[X];
            cup[X] = cup[Y];
            cup[Y] = Z;
        }
        
        for( int i = 0; i < cup.length; i++ ) {
            if( cup[i] == 1 )
                System.out.println( i );
        }
        
    }
    
}
