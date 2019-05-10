import java.util.Scanner;
 
public class BOJ_2455 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int[][] train = new int[4][2];
        
        int sum=0;
        int sum2 = 0;
        for( int i = 0; i < 4; i++ ) {
            for( int j = 0; j < 2; j++ ) {
                train[i][j] = input.nextInt();
            }
            sum = sum - train[i][0] + train[i][1];
            sum2 = sum - train[i][0] + train[i][1];
            if( sum2 > sum )
                sum = sum2;
        }
        System.out.println( sum );
    }
    
}
