import java.util.Scanner;
 
public class BOJ_2869 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int A = input.nextInt();
        int B = input.nextInt();
        int V = input.nextInt();
        
        int sum = 0;
        int count = 0;
        for( int i = 0; sum != V ; i++ ) {
            count++;
            sum += A;
            if( sum >= V ) {
                System.out.println( count );
                break;
            }
            else
                sum -= B;
        }
    }
    
}
