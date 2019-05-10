import java.util.*;
 
public class BOJ_1212 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        ArrayList< String > octalChar = new ArrayList< String >();    // 8진수 각 자리의 값을 저장할 가변 배열
        ArrayList< String > binaryChar = new ArrayList< String >();    // 2진수 각 자리의 값을 저장할 가변 배열
        
        String octal = input.nextLine();
        
        for( int i = 0; i < octal.length(); i++ )
            octalChar.add( String.valueOf( octal.charAt(i) ) );
        
        for( int i = 0; i < octal.length(); i += 1 ) {
            if( i == 0 )
                binaryChar.add( Integer.toBinaryString( Integer.parseInt( octalChar.get(i) ) ) );
            else {
                switch( Integer.toBinaryString( Integer.parseInt( octalChar.get(i) ) ).length() ) {
                    case 1:
                        binaryChar.add( "00" + Integer.toBinaryString( Integer.parseInt( octalChar.get(i) ) ) );
                        break;
                    case 2:
                        binaryChar.add( "0" + Integer.toBinaryString( Integer.parseInt( octalChar.get(i) ) ) );
                        break;
                    default:
                        binaryChar.add( Integer.toBinaryString( Integer.parseInt( octalChar.get(i) ) ) );
                        break;
                }
            }
        }
        
        for( int i = 0; i < binaryChar.size(); i++ )
            System.out.print( binaryChar.get(i) );
    }
    
}
