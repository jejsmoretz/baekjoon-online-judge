import java.util.Scanner;
 
public class BOJ_5585 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int price = input.nextInt();
        
        int count = 0;
        for( int i = 1000 - price; i > 0; i /= 10 ) {
            count += ( ( i % 10 ) / 5 ) + ( ( i % 10 ) % 5 );
        }
        System.out.println( count );
    }
}
