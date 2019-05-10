import java.util.Scanner;
 
public class BOJ_9243 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        input.nextLine();
        
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        
        boolean check = true;
        
        for( int i = 0; i < s1.length(); i++ ) {
            if( ( N % 2 == 1 && s1.charAt(i) == s2.charAt(i) ) || ( N % 2 == 0 && s1.charAt(i) != s2.charAt(i) ) )
                check = false;
        }
        String result = check ? "Deletion succeeded" : "Deletion failed";
        System.out.println( result );
    }
 
}
