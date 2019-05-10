import java.util.Scanner;
 
public class BOJ_1076 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
 
        String[][] resistance = { { "black", "0", "1" },
                                { "brown", "1", "10" },
                                { "red", "2", "100" },
                                { "orange", "3", "1000" },
                                { "yellow", "4", "10000" },
                                { "green", "5", "100000" },
                                { "blue", "6", "1000000" },
                                { "violet", "7", "10000000" },
                                { "grey", "8", "100000000" },
                                { "white", "9", "1000000000" } };
        
        String result = "";
        for( int i = 0; i < 3; i++ ) {
            String s = input.nextLine();
            for( int j = 0; j < resistance.length; j++ ) {
                if( s.equals( resistance[j][0] ) ) {
                    if( i == 0 && s.equals( "black" ) )
                        break;
                    else if( i == 2) {
                        result = String.valueOf( Long.parseLong( result ) * Long.parseLong( resistance[j][2] ) );
                        break;
                    } else {
                        result += resistance[j][1];
                        break;
                    }
                }
            }
        }
        System.out.println( result );
    }
    
}
