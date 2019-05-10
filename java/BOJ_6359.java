import java.util.*;
 
public class BOJ_6359 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        ArrayList< Integer > room = new ArrayList< Integer >();
        
        int T = input.nextInt();
        
        for( int i = 0; i < T; i++ ) {
            int n = input.nextInt();
            int count = 0;
            room.add(2);    // 배열의 인덱스와 입력 수를 매칭시키기 위해 0번 인덱스에 임의의 값을 줌
            for( int j = 1; j <= n; j++ ) {
                if( j == 1 ) {
                    for( int k = 0; k < n; k++ )
                        room.add(0);    // 0이면 문 열림
                } else
                    for( int k = j; k <= n; k += j ) {
                        if( room.get(k) == 0 )
                            room.set( k, 1 );    // 문이 닫혔으면 열고
                        else
                            room.set( k, 0 );    // 열렸으면 닫는다
                    }
            }
            for( int j = 0; j < room.size(); j++ ) {
                if( room.get(j) == 0 )    // 문이 열린 방의 수를 센다
                    count++;
            }
            System.out.println( count );
            room.clear();
        }
 
    }
    
}
