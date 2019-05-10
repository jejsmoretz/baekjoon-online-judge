import java.util.Scanner;
 
public class BOJ_3053 {
    
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        double R = input.nextDouble();
        
        System.out.printf( "%.6f", R * R * Math.PI );
        
        System.out.println();
        
        System.out.printf( "%.6f", 2 * R * R );
        
    }
    
}