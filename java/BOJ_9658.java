import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_9658 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        int N = input.nextInt();
        
        ArrayList< String > result = new ArrayList< String >();
        result.add( "NONE" );    // 입력 수와 배열 인덱스 매칭
        result.add( "CY" );        // 1일 때 CY 승
        result.add( "SK" );        // 2일 때 SK 승
        result.add( "CY" );        // 3일 때 CY 승
        result.add( "SK" );        // 4일 때 SK 승
        
        if( N >= 5 ) {
            for( int i = 5; i <= N; i++ ) {
                if( result.get( i - 1 ).equals( "CY" ) || result.get( i - 3 ).equals( "CY" ) || result.get( i - 4 ).equals( "CY" ) )
                    result.add( "SK" );
                else
                    result.add( "CY" );
            }
        }
        System.out.println( result.get( N ) );
    }
    
}
