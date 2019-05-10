import java.util.*;
 
public class BOJ_11179 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        
        String decimal = Integer.toBinaryString(N);
        String reverse = reverseString( decimal );
        
        System.out.println( Integer.valueOf( reverse, 2 ) );
        
        
    }
    
  public static String reverseString( String s ) {
        return ( new StringBuffer(s) ).reverse().toString();
      }
    
}
