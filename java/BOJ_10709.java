import java.util.ArrayList;
import java.util.Scanner;
 
public class BOJ_10709 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
       
        ArrayList< String > cloud = new ArrayList< String >();
        int H = input.nextInt();
        int W = input.nextInt();
        input.nextLine();
        
        for( int i = 0; i < H; i++ ) {
            String clouds = input.nextLine();
            for( int j = 0; j < W; j++ ) {
                cloud.add( String.valueOf( clouds.charAt(j) ) );
                if( j == 0 && cloud.get(j).equals( "." ) )
                    System.out.print( "-1 " );
                else if( cloud.get(j).equals( "c" ) )
                    System.out.print( "0 " );
                else if( cloud.get(j).equals( "." ) && cloud.lastIndexOf( "c" ) != -1 && j - cloud.lastIndexOf( "c" ) > 0 )
                    System.out.print( j - cloud.lastIndexOf( "c" ) + " " );
                else
                    System.out.print( "-1 " );
            }
            System.out.println();
            cloud.clear();
        }
        
    }
    
}
