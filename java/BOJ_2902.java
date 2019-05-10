import java.util.Scanner;
 
public class BOJ_2902 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        String s = input.nextLine();
        String check = s.toUpperCase();
        
        for( int i = 0; i < s.length(); i++ ) {
            if( s.charAt(i) != '-' && s.charAt(i) == check.charAt(i) )
                System.out.print( s.charAt(i) );
        }
    }
    
}
