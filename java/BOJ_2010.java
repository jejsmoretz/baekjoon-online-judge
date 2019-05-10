import java.util.Scanner;
 
public class BOJ_2010 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int N = input.nextInt();
        
        int sum = 0;
        for( int i = 0; i < N; i++ ) {
            sum += input.nextInt();
        }
        System.out.println( sum - N + 1  );
    }
    
}
