import java.util.Scanner;
 
public class BOJ_2920 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int[] Cmajor = new int[8];
        int check = 0;
        
        for( int i = 0; i < 8; i++ ) {
            Cmajor[i] = input.nextInt();
        }
        
        for( int i = 0; i < 8; i++ ) {
            if( Cmajor[i] == i + 1 )
                check++;
            else if( Cmajor[i] == 8 - i )
                check--;
        }
        
        if( check == 8 )
            System.out.println( "ascending" );
        else if( check == -8 )
            System.out.println( "descending" );
        else
            System.out.println( "mixed" );
        
    }
    
}
