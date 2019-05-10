import java.util.Scanner;
 
public class BOJ_2960 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        
        boolean result[] = new boolean[N + 1];
        
        int count = 0;
        for ( int i = 2; i <= N; i++ ) {
            boolean check = true;
            int min = 0;
            for ( int k = 2; k <= N; k++ ) {
                if ( check && !result[k] ) {
                    min = k;
                    check = false;
                }
            }
            int j = 1;
            while ( j * min <= N && !check ) {
                if ( !result[ j * min ] ) {
                    result[ j * min ] = true;
                    count++;
                    if( count == K ) {
                        System.out.println( j * min );
                        return;
                    }    
                }
                j++;
            }
        }
    }
}
