import java.util.Scanner;
 
public class BOJ_1016 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        long MIN = sc.nextLong();
        long MAX = sc.nextLong();
        
        Boolean[] square = new Boolean[1000001];
        
        for( int i = 0; i < 1000001; i++ )
            square[i] = false;
        
        for( long i = 2; i <= Math.sqrt(MAX); i++ ) {
            for( long j = ( ( MIN - 1 ) / ( i * i ) ) * ( i * i ) + ( i * i ); j <= MAX; j += ( i * i ) )
                square[ (int)( j - MIN ) ] = true;
        }
        
        int count = 0;
        for(int i = 0; i < MAX - MIN + 1; i++ ) {
            if(square[i] == true) {
                count += 1;
            }
        }
        System.out.print( MAX - MIN + 1 - count );
    }
    
}
