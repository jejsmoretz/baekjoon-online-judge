import java.util.Scanner;
 
public class BOJ_2965 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        
        if( B - A > C - B )
            System.out.println( B - A - 1 );
        else
            System.out.println( C - B - 1 );
    }
    
}