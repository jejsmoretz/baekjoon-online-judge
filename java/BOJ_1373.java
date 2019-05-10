import java.util.*;
 
public class BOJ_1373 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        ArrayList< String > binaryChar = new ArrayList< String >();    // 2진수 3자리수씩 끊어서 저장할 가변 배열
        ArrayList< String > octalChar = new ArrayList< String >();    // 8진수 각 자리의 값을 저장할 가변 배열
        
        String binary = input.nextLine();
        
        for( int i = binary.length() - 1; i >= 0; i -= 3 ) {
            switch( i ) {
                case 0:
                    binaryChar.add( String.valueOf( binary.charAt(i) ) );
                    break;
                case 1:
                    binaryChar.add( String.valueOf( binary.charAt( i - 1 ) ) + String.valueOf( binary.charAt(i) ) );
                    break;
                default:
                    binaryChar.add( String.valueOf( binary.charAt( i - 2 ) ) + String.valueOf( binary.charAt( i - 1 ) ) + String.valueOf( binary.charAt(i) ) );
                    break;
            }
        }
        
        for( int i = binaryChar.size() - 1; i >= 0; i-- )
            octalChar.add( String.valueOf( Integer.valueOf( binaryChar.get(i), 2 ) ) );
        
        for( int i = 0; i < octalChar.size(); i++ )
            System.out.print( octalChar.get(i) );
    }
    
}