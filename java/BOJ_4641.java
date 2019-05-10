import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
 
public class BOJ_4641 {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner( System.in );
        
        Set< Integer > set = new HashSet< Integer >();
       
        while( true ) {
            int count = 0;
            int num = input.nextInt();
            if( num == -1 )
                break;
            else if( num == 0 ) {
                int check;
                Iterator e = set.iterator();
                while( e.hasNext() ) {
                    check = (int)e.next();
                    if( set.contains( check * 2 ) )
                        count++;
                }
                System.out.println( count );
                set.clear();
                input.nextLine();
                continue;
            }
            set.add( num );
        }
    }
 
}