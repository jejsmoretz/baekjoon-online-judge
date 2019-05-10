import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
 
public class BOJ_9020 {
 
    public static void main(String[] args) {
        
        int T;
        int x = 0;
        int y = 0;
       
        try {
            BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
            PrintWriter out = new PrintWriter( new OutputStreamWriter( System.out ) );
            
            T = Integer.parseInt( in.readLine() );
            
            boolean[] result = new boolean[10001];
            int[] n = new int[T];
            String[] SUB = new String[T];
            
            for( int i = 2; i <= 10000; i++ ) {
                result[i] = true;
            }
            
            for( int i = 2; i * i <= 10000; i++ ) {
                if(result[i] == true) {
                    for(int j = i * i; j <= 10000; j += i ) {
                        result[j] = false;
                    }
                }
            }
            
            for( int i = 0; i < T; i++ ) {
                n[i] = Integer.parseInt( in.readLine() );
                int sub = n[i];
 
                for( int j = 2; j <= n[i] / 2; j++ ) {
                    if( result[j] ) {
                        if( result[ n[i] - j ] ) {
                            if( n[i] - j - j < sub ) {
                                x = j;
                                y = n[i] - j;
                                sub = y - x;
                            }
                        }
                    }
                }
                SUB[i] = x + " " + y;
            }
            
            for( int i = 0; i < n.length; i++ ) {
                System.out.println( SUB[i] );
            }
            out.flush();
        } catch(IOException e) {
            e.getMessage();
        }
 
    }
 
}
