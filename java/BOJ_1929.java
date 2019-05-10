import java.util.*;
 
public class BOJ_1929 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int M = input.nextInt();
        int N = input.nextInt();
        
        boolean[] result = new boolean[N + 1];    // 배열[i]의 i값이 미지수와 매칭되도록 1개를 더 추가함
        
        for( int i = 2; i <= N; i++ ) {
            result[i] = true;
        }
        
        for( int i = 2; i * i <= N; i++ ) {
            if(result[i] == true) {
                for(int j = i * i; j <= N; j += i ) {
                    result[j] = false;
                }
            }
        }
        
        for( int i = M; i <= N; i++ ) {
            if( result[i] == true ) {
                System.out.println(i);
            }
        }
        
    }
 
}
