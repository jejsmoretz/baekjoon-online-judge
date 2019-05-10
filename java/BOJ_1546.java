import java.util.*;
 
public class BOJ_1546 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int M = 0;
        double total = 0;
 
        int[] score = new int[N];
        double[] newScore = new double[N];
        
        for(int i = 0; i < N; i++) {
            score[i] = input.nextInt();
            if(i == 0) {
                M = score[0];
            } else {
                if(M < score[i]) {
                    M = score[i];
                }
            }
        }
        
        for(int i = 0; i < N; i++) {
            newScore[i] = (double)score[i]/M*100;
            total += newScore[i];
        }
        
        System.out.println(total/N);
        
    }
    
}
