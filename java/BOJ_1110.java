import java.util.*;
 
public class BOJ_1110 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int sum = N;
        int count = 0;
        
        while(true) {
            if(sum < 10) {
                count ++;
                sum = sum + sum * 10;
            } else {
                count++;
                sum = ((sum / 10 + sum % 10) % 10) + ((sum % 10) * 10);
            }
            if(sum == N)
                break;
        }
        System.out.println(count);
        
    }
    
}
