import java.util.Scanner;
 
public class BOJ_10039 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int[] scores = new int[5];
        int total = 0;
        
        for( int i = 0; i < scores.length; i++ ) {
            scores[i] = input.nextInt();
            
            if( scores[i] < 40 ) {
                scores[i] = 40;
            }
            
            total += scores[i];
        }
        
        System.out.println(total / scores.length);
        
    }
    
}
