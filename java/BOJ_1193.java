import java.util.Scanner;
 
public class BOJ_1193 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int X = input.nextInt();
        int n = 0;    // 분자
        int d = 0;    // 분모
        
        for( int i = 1; i <= X; i++ ) {
            if( X > total( i - 1 ) && X <= total( i ) ) {
                if( i % 2 ==0 ) {
                    n = X - total( i - 1 );
                    d = i - n + 1;
                    break;
                } else {
                    d = X - total( i - 1 );
                    n = i - d + 1;
                    break;
                }
            } else
                continue;
        }
        
        System.out.println(n + "/" + d);
        
    }
    
    // 합 계산 메소드
    public static int total(int f) {
        int sum = 0;
        for( int i = f; i > 0; i-- ) {
            sum += i;
        }
        return sum;
    }
 
}
