import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
 
public class BOJ_11720 {
 
    public static void main(String[] args) {
        
        int N;
        String num;
        int sum = 0;
        
        try {
            BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
            PrintWriter out = new PrintWriter( new OutputStreamWriter( System.out ) );
            
            N = Integer.parseInt( in.readLine() );
            num = String.valueOf( in.readLine() );
            
            for( int i = 0; i < N; i++) {
                sum += num.charAt(i) - '0';
            }
            out.print(sum);
            out.flush();
        } catch(IOException e) {
            e.getMessage();
        }
        
    }
 
}
