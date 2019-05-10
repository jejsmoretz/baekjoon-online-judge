import java.util.*;
 
public class BOJ_4948 {
 
    public static void main(String[] args) {
        
       Scanner input = new Scanner( System.in );
       
       ArrayList<Integer> list = new ArrayList<Integer>();
       ArrayList<Boolean> d = new ArrayList<Boolean>();
       ArrayList<Integer> result = new ArrayList<Integer>();
       
       d.add(false);    // index 0
       d.add(false);    // index 1
       
       while( true ) {
           int n = input.nextInt();
           
           if( n == 0 ) {
               break;
           } else {
               list.add( n );
               
               for( int i = 2; i <= n * 2; i++ ) {
                    d.add(true);
                }
                
               for( int i = 2; i * i <= n * 2; i++ ) {
                   if(d.get(i) == true) {
                       for(int j = i * i; j <= n * 2; j += i ) {
                           d.set(j, false);
                       }
                   }
               }
           }
       }
       
       for( int i = 0; i < list.size(); i++ ) {
           int count = 0;
           for( int k = list.get(i) + 1; k <= list.get(i) * 2; k++ ) {
               if( d.get(k) == true )
                   count++;
           }
           result.add(count);
       }
       
       for( int i = 0; i < list.size(); i++ )
           System.out.println( result.get(i) );
       
    }
 
}
