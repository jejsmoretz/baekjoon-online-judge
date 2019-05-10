import java.util.*;
 
public class BOJ_2577 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int result = A * B * C;
        
        String resultS = String.valueOf(result);
        
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] count = new int[10];
        
        for( int i = 0; i < resultS.length(); i++ ) {
            for( int k = 0; k < num.length; k++ ) {
                if( resultS.charAt(i) == num[k] ) {
                    count[k]++;
                }
            }
        }
        
        for( int i = 0; i < count.length; i++ ) {
            System.out.println(count[i]);
        }
        
    }
 
}
