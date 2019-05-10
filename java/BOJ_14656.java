import java.util.Arrays;
import java.util.Scanner;
 
public class BOJ_14656 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int N = input.nextInt();
        input.nextLine();
        int[] people = new int[N];
        int[] copy = new int[N];
        
        for( int i = 0; i < N; i++ )
            people[i] = input.nextInt();
        
        copy = people.clone();
        Arrays.sort( copy );
        
        int count = 0;
        for( int i = 0; i < N; i++ ) {
            if( people[i] != copy[i] )
                count++;
        }
        System.out.println( count );
    }
    
}
