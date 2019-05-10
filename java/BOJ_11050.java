import java.util.Scanner;
 
public class BOJ_11050 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
 
        int N = input.nextInt();
        int K = input.nextInt();
        
        int bc = factorial(N) / ( factorial(K) * factorial( N - K ) );
        
        System.out.println( bc );
        
    }
    
    // 팩토리얼 계산 메소드
    public static int factorial( int x ) {
        int fac = 1;
        
        for( int i = x; i > 0; i-- ) {
            fac *= i;
        }
        return fac;
    }
    
}
