import java.util.*;
 
public class BOJ_4344 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int C = input.nextInt();
        
        int[] students = new int[C];
        double[][] avgPer = new double[C][2];
        
        for(int i = 0; i < students.length; i++) {
            students[i] = input.nextInt();
            int[] scores = new int[students[i]];
            for(int k = 0; k < scores.length; k++) {
                scores[k] = input.nextInt();
            }
            int total = 0;
            for(int k = 0; k < scores.length; k++) {
                total += scores[k];
                avgPer[i][0] = (double)total/scores.length;
            }
            int count = 0;
            for(int k = 0; k < scores.length; k++) {
                if(scores[k] > (double)avgPer[i][0])
                    count++;
                avgPer[i][1] = (double)count/scores.length*100;
            }
        }
        for(int i = 0; i < avgPer.length; i++) {
            System.out.printf("%.3f%s\n", avgPer[i][1], "%");
        }
        
    }
    
}
