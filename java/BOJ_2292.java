import java.util.Scanner;
 
public class BOJ_2292 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        int number = 1;
        int count;
        
        for( count = 1; N > number; count++ ) {
            number += 6 * count;
        }
        
        System.out.println(count);
        
    }
 
}
