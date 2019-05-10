import java.util.Scanner;
 
public class BOJ_10984 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int T = input.nextInt();
        
        for( int i = 0; i < T; i++ ) {
            int scores = 0;
            double total = 0;
            int N = input.nextInt();
            for( int j = 0; j < N; j++ ) {
                int score = input.nextInt();
                double GPA = input.nextDouble();
                scores += score;
                total += score * GPA;
            }
            System.out.printf("%d %.1f\n", scores, (double)( total / scores ) );
        }
    }
}
