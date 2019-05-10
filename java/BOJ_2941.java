import java.util.Scanner;
 
public class BOJ_2941 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
 
        String s = input.nextLine();
        
        String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        
        for( int i = 0; i < croatia.length; i++ ) {
            s = s.replace( croatia[i], " " );
        }
        
        System.out.println( s.length() );
        
    }
    
}